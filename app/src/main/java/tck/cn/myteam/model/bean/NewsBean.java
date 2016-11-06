package tck.cn.myteam.model.bean;

import java.util.List;

/**
 * Description :
 * <p>
 * Created by tck on 2016/11/6.
 */

public class NewsBean {

    /**
     * code : 1
     * message : success
     * result : {"items":[{"author":"局长","body":"Vue v2.0.5 发布了，Vue.js 是构建 Web 界面的 JavaScript 库，提供数据驱动的组件，还有简单灵活的 API，使得 MVVM 更简单。 该版本修复了一些来自...","commentCount":16,"href":"https://www.oschina.net/news/78744/vue-js-2-0-5","id":78744,"pubDate":"2016-11-05 13:46:10","recommend":true,"title":"Vue v2.0.5 发布，Bug 修复","type":6,"viewCount":2052},{"author":"局长","body":"ZeroMQ 核心引擎 libzmq 4.2.0 稳定版发布了。0MQ (ZeroMQ) 是一个轻量级消息内核。它可用于 C、C++、Python、.NET  /Mono、Fortran 和 Java 语言...","commentCount":17,"href":"https://www.oschina.net/news/78743/zeromq-libzmq-4-2-0","id":78743,"pubDate":"2016-11-05 09:00:28","recommend":true,"title":"ZeroMQ 核心引擎 libzmq 4.2.0 稳定版发布","type":6,"viewCount":1944},{"author":"局长","body":"ArangoDB v3.1.0 发布了，这个是 Bug 修复版本。具体如下： Fix rpm install/uninstall on suse/redaht 点此查看发布说明和完整更新内容 下载地址：...","commentCount":0,"href":"https://www.oschina.net/news/78742/arangodb-3-1-0","id":78742,"pubDate":"2016-11-05 08:50:51","recommend":true,"title":"ArangoDB v3.1.0 发布，Bug 修复版本","type":6,"viewCount":713},{"author":"局长","body":"OCaml 4.04.0 发布了，该版本更新内容如下： 语言特性： PR#7233: Support GADT equations on non-local abstract types (Jacques Garrigue) GPR#1...","commentCount":0,"href":"https://www.oschina.net/news/78741/ocaml-4-04-0","id":78741,"pubDate":"2016-11-05 08:40:41","recommend":true,"title":"OCaml 4.04.0 发布，Caml 编程语言的主要实现","type":6,"viewCount":655},{"author":"局长","body":"Vue v2.0.4 发布了，Vue.js 是构建 Web 界面的 JavaScript 库，提供数据驱动的组件，还有简单灵活的 API，使得 MVVM 更简单。 该版本更新内容： 构...","commentCount":9,"href":"https://www.oschina.net/news/78740/vue-js-2-0-4","id":78740,"pubDate":"2016-11-05 08:28:21","recommend":true,"title":"Vue v2.0.4 发布，SSR 性能改进 20％","type":6,"viewCount":1817},{"author":"局长","body":"Git for Windows 发布了 v2.11.0 RC0。暂未发现更新内容，点此查看提交记录。 这个版本映射了 Git for Windows 当前的 \u201cmaster\u201d 分支，合并为上游...","commentCount":0,"href":"https://www.oschina.net/news/78739/git-for-windows-v2-11-0-rc0","id":78739,"pubDate":"2016-11-05 08:22:42","recommend":false,"title":"Git for Windows 发布 v2.11.0 RC0","type":6,"viewCount":651},{"author":"局长","body":"PMD 5.4.3 和 5.3.8 发布了，PMD 是一款采用 BSD 协议发布的 Java 程序代码检查工具。该工具可以做到检查 Java 代码中是否含有未使用的变量、是否含...","commentCount":2,"href":"https://www.oschina.net/news/78738/pmd-5-4-3-and-5-3-8","id":78738,"pubDate":"2016-11-05 08:04:30","recommend":false,"title":"PMD 5.4.3 和 5.3.8 发布，Java 程序代码检查工具","type":6,"viewCount":725},{"author":"达尔文","body":"本文主要分析 C、C++98、C++11、Java 与 Go，主要论述语言的关键能力。在论述的过程中会结合华为各语言编程专家和华为电信软件内部的骨干开发人员的...","commentCount":37,"href":"https://www.oschina.net/news/78737/go-java-c","id":78737,"pubDate":"2016-11-05 08:03:38","recommend":false,"title":"大神为你分析 Go、Java、C 等主流编程语言","type":6,"viewCount":4936},{"author":"局长","body":"Redis Desktop Manager 0.9.0-alpha3 发布了，Redis Desktop Manager（RedisDesktopManager，RDM）是一个快速、简单、支持跨平台的 Redis 桌面管理...","commentCount":1,"href":"https://www.oschina.net/news/78736/redis-desktop-manager-0-9-0-alpha3","id":78736,"pubDate":"2016-11-05 07:54:12","recommend":false,"title":"Redis Desktop Manager 0.9.0-alpha3 发布","type":6,"viewCount":894},{"author":"达尔文","body":"12月4日OSC源创会年终盛典相约北京国际会议中心。源创会年终盛典是由\u201c开源中国社区\u201d主办的开源技术盛会，一年一次，旨在推广和传播开源技术，关注...","commentCount":0,"href":"http://www.oschina.net/2016-beijing-ceremony","id":78735,"pubDate":"2016-11-05 07:50:45","recommend":false,"title":"12月网易技术专家在北京源创会谈 IM 通讯优化","type":0,"viewCount":6},{"author":"局长","body":"Sysstat v11.5.2、v11.4.2 和 v11.2.8 发布了。SYSSTAT 是一个软件包，包含监测系统性能及效率的一组工具，这些工具对于我们收集系统性能数据，比如...","commentCount":1,"href":"https://www.oschina.net/news/78734/sysstat-11-5-2-and-11-4-2","id":78734,"pubDate":"2016-11-05 07:43:44","recommend":false,"title":"Sysstat v11.5.2、v11.4.2 和 v11.2.8 发布","type":6,"viewCount":354},{"author":"达尔文","body":"【一周开源资讯（2016.10.29-2016.10.4）】谷歌安全又有速度，微软\u201c硬件\u201d开源，Apache Hive 也不甘示弱：我引入内存计算，性能提升26倍。...","commentCount":6,"href":"https://my.oschina.net/u/2894582/blog/781927","id":781927,"pubDate":"2016-11-05 07:40:57","recommend":false,"title":"源资讯｜本周谷歌、微软相爱相杀，Apache Hive 插足","type":3,"viewCount":1739},{"author":"达尔文","body":"什么是死信呢？官方给出三个说法：......","commentCount":0,"href":"https://my.oschina.net/huaxian8812/blog/780086","id":780086,"pubDate":"2016-11-05 07:37:49","recommend":false,"title":"每日一博 | RabbitMQ 死信/死信队列 ","type":3,"viewCount":1325},{"author":"达尔文","body":"尽管 HTTPS 的应用已经如此广泛，你仍然可以遇到一些软件并不对这套协议进行处理，因为它们觉着没必要。不幸的是我曾在使用一种语言实现认证系统融...","commentCount":1,"href":"https://www.oschina.net/translate/mutual-problems","id":10003616,"pubDate":"2016-11-05 07:35:47","recommend":false,"title":"协作翻译 | 浅谈 HTTPS 和 Java 的融合问题","type":4,"viewCount":963},{"author":"达尔文","body":"有人可以不需要你再假装坚强，一个抱，就可以解除你的所有武装......","commentCount":35,"href":"https://my.oschina.net/xxiaobian/blog/782019","id":782019,"pubDate":"2016-11-05 07:33:49","recommend":false,"title":"OSChina 周六乱弹 \u2014\u2014 生日快乐 @落落酱","type":3,"viewCount":1527},{"author":"局长","body":"Chrome OS 稳定版发布更新了，更新至 54.0.2840.93（平台版本：8743.83.0），这次发布的版本支持除了 HP Chromebook 13 G1, Acer Chromebook 14 fo...","commentCount":2,"href":"https://www.oschina.net/news/78729/chrome-os-stable-54-0-2840-93","id":78729,"pubDate":"2016-11-05 07:32:02","recommend":false,"title":"Chrome OS 稳定版更新至 54.0.2840.93","type":6,"viewCount":1156},{"author":"达尔文","body":"Turtle online 是Turtle框架的PC前端架构，包括组件和API两大部分，可以快速的搭建PC前端开发环境。","commentCount":0,"href":"http://git.oschina.net/yinluhui/turtle-online","id":78728,"pubDate":"2016-11-05 07:31:02","recommend":false,"title":"Git 项目推荐  | Turtle 的前端架构 Turtle online ","type":0,"viewCount":6},{"author":"达尔文","body":"一键化打造 Vim IDE 环境：自动生成头信息，自动补全，自动折叠，自动生成 markdown 目录","commentCount":3,"href":"https://www.oschina.net/p/onekey-to-vim-ide","id":43754,"pubDate":"2016-11-05 07:23:51","recommend":false,"title":"Vim IDE \u2014\u2014 一键化打造 Vim IDE 环境","type":1,"viewCount":2423},{"author":"局长","body":"Sequelize v3.24.8 发布了，Sequelize.js 提供对 MySQL，MariaDB，SQLite 和PostgreSQL 数据库的简单访问，通过映射数据库条目到对象，或者对象...","commentCount":1,"href":"https://www.oschina.net/news/78726/sequelize-3-24-8","id":78726,"pubDate":"2016-11-05 07:22:56","recommend":false,"title":"Sequelize v3.24.8 发布，Node.js 的 ORM","type":6,"viewCount":270},{"author":"达尔文","body":"设计是一门不断发现问题并解决问题的艺术：发现需求，形成想法，然后打造合适的解决方案，周而复始。现在，这一极富创意和挑战的工作，有了一个新的...","commentCount":5,"href":"https://www.oschina.net/news/78725/google-material-io","id":78725,"pubDate":"2016-11-05 07:16:01","recommend":false,"title":"Google 推出开源设计平台 Material.io","type":6,"viewCount":1780}],"nextPageToken":"DBA816934CD0AA59","pageInfo":{"resultsPerPage":1,"totalResults":72291},"prevPageToken":"0997C855C600E421"}
     * time : 2016-11-06 00:32:47
     */

    private int code;
    private String message;
    /**
     * items : [{"author":"局长","body":"Vue v2.0.5 发布了，Vue.js 是构建 Web 界面的 JavaScript 库，提供数据驱动的组件，还有简单灵活的 API，使得 MVVM 更简单。 该版本修复了一些来自...","commentCount":16,"href":"https://www.oschina.net/news/78744/vue-js-2-0-5","id":78744,"pubDate":"2016-11-05 13:46:10","recommend":true,"title":"Vue v2.0.5 发布，Bug 修复","type":6,"viewCount":2052},{"author":"局长","body":"ZeroMQ 核心引擎 libzmq 4.2.0 稳定版发布了。0MQ (ZeroMQ) 是一个轻量级消息内核。它可用于 C、C++、Python、.NET  /Mono、Fortran 和 Java 语言...","commentCount":17,"href":"https://www.oschina.net/news/78743/zeromq-libzmq-4-2-0","id":78743,"pubDate":"2016-11-05 09:00:28","recommend":true,"title":"ZeroMQ 核心引擎 libzmq 4.2.0 稳定版发布","type":6,"viewCount":1944},{"author":"局长","body":"ArangoDB v3.1.0 发布了，这个是 Bug 修复版本。具体如下： Fix rpm install/uninstall on suse/redaht 点此查看发布说明和完整更新内容 下载地址：...","commentCount":0,"href":"https://www.oschina.net/news/78742/arangodb-3-1-0","id":78742,"pubDate":"2016-11-05 08:50:51","recommend":true,"title":"ArangoDB v3.1.0 发布，Bug 修复版本","type":6,"viewCount":713},{"author":"局长","body":"OCaml 4.04.0 发布了，该版本更新内容如下： 语言特性： PR#7233: Support GADT equations on non-local abstract types (Jacques Garrigue) GPR#1...","commentCount":0,"href":"https://www.oschina.net/news/78741/ocaml-4-04-0","id":78741,"pubDate":"2016-11-05 08:40:41","recommend":true,"title":"OCaml 4.04.0 发布，Caml 编程语言的主要实现","type":6,"viewCount":655},{"author":"局长","body":"Vue v2.0.4 发布了，Vue.js 是构建 Web 界面的 JavaScript 库，提供数据驱动的组件，还有简单灵活的 API，使得 MVVM 更简单。 该版本更新内容： 构...","commentCount":9,"href":"https://www.oschina.net/news/78740/vue-js-2-0-4","id":78740,"pubDate":"2016-11-05 08:28:21","recommend":true,"title":"Vue v2.0.4 发布，SSR 性能改进 20％","type":6,"viewCount":1817},{"author":"局长","body":"Git for Windows 发布了 v2.11.0 RC0。暂未发现更新内容，点此查看提交记录。 这个版本映射了 Git for Windows 当前的 \u201cmaster\u201d 分支，合并为上游...","commentCount":0,"href":"https://www.oschina.net/news/78739/git-for-windows-v2-11-0-rc0","id":78739,"pubDate":"2016-11-05 08:22:42","recommend":false,"title":"Git for Windows 发布 v2.11.0 RC0","type":6,"viewCount":651},{"author":"局长","body":"PMD 5.4.3 和 5.3.8 发布了，PMD 是一款采用 BSD 协议发布的 Java 程序代码检查工具。该工具可以做到检查 Java 代码中是否含有未使用的变量、是否含...","commentCount":2,"href":"https://www.oschina.net/news/78738/pmd-5-4-3-and-5-3-8","id":78738,"pubDate":"2016-11-05 08:04:30","recommend":false,"title":"PMD 5.4.3 和 5.3.8 发布，Java 程序代码检查工具","type":6,"viewCount":725},{"author":"达尔文","body":"本文主要分析 C、C++98、C++11、Java 与 Go，主要论述语言的关键能力。在论述的过程中会结合华为各语言编程专家和华为电信软件内部的骨干开发人员的...","commentCount":37,"href":"https://www.oschina.net/news/78737/go-java-c","id":78737,"pubDate":"2016-11-05 08:03:38","recommend":false,"title":"大神为你分析 Go、Java、C 等主流编程语言","type":6,"viewCount":4936},{"author":"局长","body":"Redis Desktop Manager 0.9.0-alpha3 发布了，Redis Desktop Manager（RedisDesktopManager，RDM）是一个快速、简单、支持跨平台的 Redis 桌面管理...","commentCount":1,"href":"https://www.oschina.net/news/78736/redis-desktop-manager-0-9-0-alpha3","id":78736,"pubDate":"2016-11-05 07:54:12","recommend":false,"title":"Redis Desktop Manager 0.9.0-alpha3 发布","type":6,"viewCount":894},{"author":"达尔文","body":"12月4日OSC源创会年终盛典相约北京国际会议中心。源创会年终盛典是由\u201c开源中国社区\u201d主办的开源技术盛会，一年一次，旨在推广和传播开源技术，关注...","commentCount":0,"href":"http://www.oschina.net/2016-beijing-ceremony","id":78735,"pubDate":"2016-11-05 07:50:45","recommend":false,"title":"12月网易技术专家在北京源创会谈 IM 通讯优化","type":0,"viewCount":6},{"author":"局长","body":"Sysstat v11.5.2、v11.4.2 和 v11.2.8 发布了。SYSSTAT 是一个软件包，包含监测系统性能及效率的一组工具，这些工具对于我们收集系统性能数据，比如...","commentCount":1,"href":"https://www.oschina.net/news/78734/sysstat-11-5-2-and-11-4-2","id":78734,"pubDate":"2016-11-05 07:43:44","recommend":false,"title":"Sysstat v11.5.2、v11.4.2 和 v11.2.8 发布","type":6,"viewCount":354},{"author":"达尔文","body":"【一周开源资讯（2016.10.29-2016.10.4）】谷歌安全又有速度，微软\u201c硬件\u201d开源，Apache Hive 也不甘示弱：我引入内存计算，性能提升26倍。...","commentCount":6,"href":"https://my.oschina.net/u/2894582/blog/781927","id":781927,"pubDate":"2016-11-05 07:40:57","recommend":false,"title":"源资讯｜本周谷歌、微软相爱相杀，Apache Hive 插足","type":3,"viewCount":1739},{"author":"达尔文","body":"什么是死信呢？官方给出三个说法：......","commentCount":0,"href":"https://my.oschina.net/huaxian8812/blog/780086","id":780086,"pubDate":"2016-11-05 07:37:49","recommend":false,"title":"每日一博 | RabbitMQ 死信/死信队列 ","type":3,"viewCount":1325},{"author":"达尔文","body":"尽管 HTTPS 的应用已经如此广泛，你仍然可以遇到一些软件并不对这套协议进行处理，因为它们觉着没必要。不幸的是我曾在使用一种语言实现认证系统融...","commentCount":1,"href":"https://www.oschina.net/translate/mutual-problems","id":10003616,"pubDate":"2016-11-05 07:35:47","recommend":false,"title":"协作翻译 | 浅谈 HTTPS 和 Java 的融合问题","type":4,"viewCount":963},{"author":"达尔文","body":"有人可以不需要你再假装坚强，一个抱，就可以解除你的所有武装......","commentCount":35,"href":"https://my.oschina.net/xxiaobian/blog/782019","id":782019,"pubDate":"2016-11-05 07:33:49","recommend":false,"title":"OSChina 周六乱弹 \u2014\u2014 生日快乐 @落落酱","type":3,"viewCount":1527},{"author":"局长","body":"Chrome OS 稳定版发布更新了，更新至 54.0.2840.93（平台版本：8743.83.0），这次发布的版本支持除了 HP Chromebook 13 G1, Acer Chromebook 14 fo...","commentCount":2,"href":"https://www.oschina.net/news/78729/chrome-os-stable-54-0-2840-93","id":78729,"pubDate":"2016-11-05 07:32:02","recommend":false,"title":"Chrome OS 稳定版更新至 54.0.2840.93","type":6,"viewCount":1156},{"author":"达尔文","body":"Turtle online 是Turtle框架的PC前端架构，包括组件和API两大部分，可以快速的搭建PC前端开发环境。","commentCount":0,"href":"http://git.oschina.net/yinluhui/turtle-online","id":78728,"pubDate":"2016-11-05 07:31:02","recommend":false,"title":"Git 项目推荐  | Turtle 的前端架构 Turtle online ","type":0,"viewCount":6},{"author":"达尔文","body":"一键化打造 Vim IDE 环境：自动生成头信息，自动补全，自动折叠，自动生成 markdown 目录","commentCount":3,"href":"https://www.oschina.net/p/onekey-to-vim-ide","id":43754,"pubDate":"2016-11-05 07:23:51","recommend":false,"title":"Vim IDE \u2014\u2014 一键化打造 Vim IDE 环境","type":1,"viewCount":2423},{"author":"局长","body":"Sequelize v3.24.8 发布了，Sequelize.js 提供对 MySQL，MariaDB，SQLite 和PostgreSQL 数据库的简单访问，通过映射数据库条目到对象，或者对象...","commentCount":1,"href":"https://www.oschina.net/news/78726/sequelize-3-24-8","id":78726,"pubDate":"2016-11-05 07:22:56","recommend":false,"title":"Sequelize v3.24.8 发布，Node.js 的 ORM","type":6,"viewCount":270},{"author":"达尔文","body":"设计是一门不断发现问题并解决问题的艺术：发现需求，形成想法，然后打造合适的解决方案，周而复始。现在，这一极富创意和挑战的工作，有了一个新的...","commentCount":5,"href":"https://www.oschina.net/news/78725/google-material-io","id":78725,"pubDate":"2016-11-05 07:16:01","recommend":false,"title":"Google 推出开源设计平台 Material.io","type":6,"viewCount":1780}]
     * nextPageToken : DBA816934CD0AA59
     * pageInfo : {"resultsPerPage":1,"totalResults":72291}
     * prevPageToken : 0997C855C600E421
     */

    private ResultBean result;
    private String time;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public static class ResultBean {
        private String nextPageToken;
        /**
         * resultsPerPage : 1
         * totalResults : 72291
         */

        private PageInfoBean pageInfo;
        private String prevPageToken;
        /**
         * author : 局长
         * body : Vue v2.0.5 发布了，Vue.js 是构建 Web 界面的 JavaScript 库，提供数据驱动的组件，还有简单灵活的 API，使得 MVVM 更简单。 该版本修复了一些来自...
         * commentCount : 16
         * href : https://www.oschina.net/news/78744/vue-js-2-0-5
         * id : 78744
         * pubDate : 2016-11-05 13:46:10
         * recommend : true
         * title : Vue v2.0.5 发布，Bug 修复
         * type : 6
         * viewCount : 2052
         */

        private List<ItemsBean> items;

        public String getNextPageToken() {
            return nextPageToken;
        }

        public void setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
        }

        public PageInfoBean getPageInfo() {
            return pageInfo;
        }

        public void setPageInfo(PageInfoBean pageInfo) {
            this.pageInfo = pageInfo;
        }

        public String getPrevPageToken() {
            return prevPageToken;
        }

        public void setPrevPageToken(String prevPageToken) {
            this.prevPageToken = prevPageToken;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class PageInfoBean {
            private int resultsPerPage;
            private int totalResults;

            public int getResultsPerPage() {
                return resultsPerPage;
            }

            public void setResultsPerPage(int resultsPerPage) {
                this.resultsPerPage = resultsPerPage;
            }

            public int getTotalResults() {
                return totalResults;
            }

            public void setTotalResults(int totalResults) {
                this.totalResults = totalResults;
            }
        }

        public static class ItemsBean {
            private String author;
            private String body;
            private int commentCount;
            private String href;
            private int id;
            private String pubDate;
            private boolean recommend;
            private String title;
            private int type;
            private int viewCount;

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public String getBody() {
                return body;
            }

            public void setBody(String body) {
                this.body = body;
            }

            public int getCommentCount() {
                return commentCount;
            }

            public void setCommentCount(int commentCount) {
                this.commentCount = commentCount;
            }

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getPubDate() {
                return pubDate;
            }

            public void setPubDate(String pubDate) {
                this.pubDate = pubDate;
            }

            public boolean isRecommend() {
                return recommend;
            }

            public void setRecommend(boolean recommend) {
                this.recommend = recommend;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getViewCount() {
                return viewCount;
            }

            public void setViewCount(int viewCount) {
                this.viewCount = viewCount;
            }
        }
    }
}
