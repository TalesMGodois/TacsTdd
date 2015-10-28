class testme(unittest.TestCase):
    def test_recognizesEntries(self):
        url = "http://agileinaflash.com/feeds/posts/default"
        content = urllib2.urlopen(url).read()        # 1
        self.assertGreater(len(content),0)          # 2
        open("localfeed.rss", "w").write(content)        # 3
        sut = ArticleRssParser('localfeed.rss')        # 4
        self.assertTrue(sut.HasArticles())
