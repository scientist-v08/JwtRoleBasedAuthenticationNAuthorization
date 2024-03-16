package scientist.v08.jwtspringsecurity.service;

import scientist.v08.jwtspringsecurity.dto.ReqRes;

public interface AuthService {
    public ReqRes signUp(ReqRes registrationRequest);
    public ReqRes signIn(ReqRes signinRequest);
    public ReqRes refreshToken(ReqRes refreshTokenReqiest);
}
