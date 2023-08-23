package com.acline.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ansi.AnsiColor;
import org.springframework.boot.ansi.AnsiOutput;
import org.springframework.boot.ansi.AnsiStyle;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 * @author Aaron Chen
 * @date：2023/4/28 14:34
 * @Description:TODO
 */
@Component
public class PrintBanner implements ApplicationListener<ApplicationReadyEvent> {
    public static final String[] BANNER = {
            "                                       \n" +
                    "   _______  _______________  __________\n" +
                    "  / ___/ / / / ___/ ___/ _ \\/ ___/ ___/\n" +
                    " (__  ) /_/ / /__/ /__/  __(__  |__  )\n" +
                    "/____/\\__,_/\\___/\\___/\\___/____/____/\n" +
                    "                                       "
    };
    @Value("${project.version}")
    private String version;
    private String bannerName = "[SystemVersion:";

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        Log log = LogFactory.getLog(PrintBanner.class);
        log.info("start finish");
        log.info("服务cpu核心数：" + Runtime.getRuntime().availableProcessors());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);

        for (String str : BANNER) {
            printStream.println(AnsiOutput.toString(AnsiColor.BRIGHT_GREEN, str));
        }
        version = (version != null) ? " V" + version + "]" : "";

        StringBuilder builder = new StringBuilder();
        while (builder.length() < 24 - (version.length() + bannerName.length())) {
            builder.append(" ");
        }
        printStream.println(AnsiOutput.toString(AnsiColor.RED, bannerName, AnsiColor.RED, builder.toString(),
                AnsiStyle.FAINT, version));
        try {
            log.info(baos.toString("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

    }
}
