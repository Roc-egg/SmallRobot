package com.example.hp.smallrobot.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/10/29 0029.
 */

public class YYBean {

    /**
     * moreResults : [{"rc":0,"answer":{"type":"T","text":"你无聊的时候，我会陪你说话。"},"service":"chat","text":"你会做些什么？","operation":"ANSWER"}]
     * rc : 0
     * operation : ANSWER
     * service : openQA
     * answer : {"type":"T","text":"忙的时候我在想你，不忙的时候脑海里全是你。"}
     * text : 你会做些什么？
     */

    private int rc;
    private String operation;
    private String service;
    /**
     * type : T
     * text : 忙的时候我在想你，不忙的时候脑海里全是你。
     */

    private AnswerBean answer;
    private String text;
    /**
     * rc : 0
     * answer : {"type":"T","text":"你无聊的时候，我会陪你说话。"}
     * service : chat
     * text : 你会做些什么？
     * operation : ANSWER
     */

    private List<MoreResultsBean> moreResults;

    public int getRc() {
        return rc;
    }

    public void setRc(int rc) {
        this.rc = rc;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public AnswerBean getAnswer() {
        return answer;
    }

    public void setAnswer(AnswerBean answer) {
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<MoreResultsBean> getMoreResults() {
        return moreResults;
    }

    public void setMoreResults(List<MoreResultsBean> moreResults) {
        this.moreResults = moreResults;
    }

    public static class AnswerBean {
        private String type;
        private String text;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public static class MoreResultsBean {
        private int rc;
        /**
         * type : T
         * text : 你无聊的时候，我会陪你说话。
         */

        private AnswerBean answer;
        private String service;
        private String text;
        private String operation;

        public int getRc() {
            return rc;
        }

        public void setRc(int rc) {
            this.rc = rc;
        }

        public AnswerBean getAnswer() {
            return answer;
        }

        public void setAnswer(AnswerBean answer) {
            this.answer = answer;
        }

        public String getService() {
            return service;
        }

        public void setService(String service) {
            this.service = service;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getOperation() {
            return operation;
        }

        public void setOperation(String operation) {
            this.operation = operation;
        }

        public static class AnswerBean {
            private String type;
            private String text;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }
        }
    }
}
