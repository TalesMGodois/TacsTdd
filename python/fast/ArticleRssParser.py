class ArticleRssParser(object):
    @classmethod
    def get_feed_content(cls, filename):
        return open(filename).read()
    # … the rest of the class elided