package com.bitget.openapi;

import com.bitget.openapi.common.client.BitgetRestClient;
import com.bitget.openapi.common.domain.ClientParameter;
import com.bitget.openapi.common.enums.SignTypeEnum;
import com.bitget.openapi.common.enums.SupportedLocaleEnum;
import org.junit.After;
import org.junit.Before;

/**
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public class BaseTest {

    /**
     * 用户 apiKey 替换成自己的
     */
    private final String apiKey = "bg_38cb6492aef36e8a66d576dfbd48192e";

    /**
     * 用户 secretKey 替换成自己的
     */
    private final String secretKey = "9a38b503033fc7e99e6a7649c5a23b952ea3a24e5eb7f9da57f46a6822e56058";

    /**
     * 口令 替换成自己的
     */
    private final String passphrase = "zhoujia123";

    /**
     * bitget open api 根路径
     */
    private final String baseUrl = "https://api.bitget.com";

    private final ClientParameter parameter = ClientParameter.builder()
            .apiKey(apiKey)
            .secretKey(secretKey)
            .passphrase(passphrase)
            .baseUrl(baseUrl)
            //.signType(SignTypeEnum.RSA) // 如果你的apikey是RSA类型则主动设置
            .locale(SupportedLocaleEnum.ZH_CN.getName())
            .build();
    public BitgetRestClient bitgetRestClient;

    @Before
    public void setup() {
        bitgetRestClient = BitgetRestClient.builder().configuration(parameter).build();
    }

    @After
    public void tearDown() {
    }
}
