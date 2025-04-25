package com.acline.common.webchart;/**
 * @author Aaron Chen
 * @date：2022/12/7 15:28
 * @Description
 * @Version 1.0
 */

/**
 * @author Aaron Chen
 * @date：2022/12/7 15:28
 * @Description
 */

import lombok.Data;

import java.util.Arrays;
import java.util.List;
@Data
public class WechatWorkMessage {
    /**
     * msgtype : text
     * text : {"content":"DCIM发生异常啦。要炸锅了！！😰","mentioned_mobile_list":["18861664946","@all"]}
     */

    private String   msgtype;
    private TextBean text;

    public WechatWorkMessage(String content, boolean atALL) {
        this.msgtype = "text";
        this.text = new TextBean();
        this.text.setContent(content);
        if (atALL) {
            this.text.setMentioned_mobile_list(Arrays.asList("@all"));
        }
    }
    @Data
    public static class TextBean {
        /**
         * content : DCIM发生异常啦。要炸锅了！！😰
         * mentioned_mobile_list : ["18861664946","@all"]
         */
        private String       content;
        private List<String> mentioned_mobile_list;
    }
}
