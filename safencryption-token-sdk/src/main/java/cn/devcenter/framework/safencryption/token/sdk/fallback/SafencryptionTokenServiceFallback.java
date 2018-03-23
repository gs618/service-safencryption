package cn.devcenter.framework.safencryption.token.sdk.fallback;

import cn.devcenter.framework.safencryption.token.sdk.SafencryptionTokenService;
import cn.devcenter.model.token.AccessToken;
import cn.housecenter.dlfc.framework.boot.stereotype.Component;
import cn.housecenter.dlfc.framework.boot.stereotype.Service;
import cn.housecenter.dlfc.framework.web.core.AjaxResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Component
public class SafencryptionTokenServiceFallback implements SafencryptionTokenService {

    @RequestMapping(value = "/generate/fallback", method = RequestMethod.POST)
    @Override
    public AjaxResult<AccessToken> generateAccessToken(AccessToken token) {
        log.warn("method [authenticate(id, secret)] is not available.");
        return AjaxResult.newInstance(AccessToken.class).fail("Token服务繁忙");
    }

}
