class Smell{
    public ReportMailer(MailDestination[] destinations) {
        this.destinations = destinations;

        if (destinations.length == 0)
            throw new RuntimeException("dests required");

        for (int i = 0; i < destinations.length; i++) {
            if (MailDestination.getEndpoint(destinations[i]) == null)
                throw new RuntimeException("invalid endpoint");
        }
    }
}