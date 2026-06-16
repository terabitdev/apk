package io.elevenlabs.data.services;

import android.gov.nist.core.Separators;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.data.api.PronunciationsAPI;
import io.elevenlabs.data.model.request.PronunciationPreviewRequest;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.domain.services.AppCheckTokenService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.PronunciationsServiceImpl$generatePreviewUrl$2", f = "PronunciationsServiceImpl.kt", l = {112, 121, 125}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfr/d0;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "", "<anonymous>", "(Lfr/d0;)Lio/elevenlabs/domain/model/AsyncCallResult;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class PronunciationsServiceImpl$generatePreviewUrl$2 extends yn.i implements p {
    final /* synthetic */ String $text;
    final /* synthetic */ String $voiceId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ PronunciationsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PronunciationsServiceImpl$generatePreviewUrl$2(String str, String str2, PronunciationsServiceImpl pronunciationsServiceImpl, wn.c<? super PronunciationsServiceImpl$generatePreviewUrl$2> cVar) {
        super(2, cVar);
        this.$text = str;
        this.$voiceId = str2;
        this.this$0 = pronunciationsServiceImpl;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new PronunciationsServiceImpl$generatePreviewUrl$2(this.$text, this.$voiceId, this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super AsyncCallResult<String>> cVar) {
        return ((PronunciationsServiceImpl$generatePreviewUrl$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a4, code lost:
    
        if (r14 == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        String j4;
        Map map;
        AppCheckTokenService appCheckTokenService;
        Map map2;
        Logger logger2;
        Logger logger3;
        AnonCaptchaTokenService anonCaptchaTokenService;
        String str;
        String str2;
        PronunciationsAPI pronunciationsAPI;
        String str3;
        Map map3;
        Logger logger4;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            str3 = (String) this.L$0;
                            sn.a.g(obj);
                            ResponseBody responseBody = (ResponseBody) obj;
                            File createTempFile = File.createTempFile("pronunciation_preview_", ".mp3");
                            createTempFile.deleteOnExit();
                            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                            try {
                                InputStream a10 = responseBody.a();
                                try {
                                    android.support.v4.media.session.b.j(a10, fileOutputStream, UserMetadata.MAX_INTERNAL_KEY_SIZE);
                                    a10.close();
                                    fileOutputStream.close();
                                    String uri = createTempFile.toURI().toString();
                                    uri.getClass();
                                    map3 = this.this$0.previewCache;
                                    map3.put(str3, uri);
                                    logger4 = this.this$0.logger;
                                    logger4.log("PronunciationsService", defpackage.f.k("Cached pronunciation preview for: ", this.$text, " with voice: ", this.$voiceId));
                                    return new AsyncCallResult.Success(uri);
                                } finally {
                                }
                            } finally {
                            }
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        str = (String) this.L$1;
                        str2 = (String) this.L$0;
                        sn.a.g(obj);
                        String str4 = (String) obj;
                        PronunciationPreviewRequest pronunciationPreviewRequest = new PronunciationPreviewRequest(this.$text, this.$voiceId);
                        pronunciationsAPI = this.this$0.pronunciationsApi;
                        this.L$0 = str2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 3;
                        obj = pronunciationsAPI.previewPronunciation(str, str4, pronunciationPreviewRequest, this);
                        if (obj != aVar) {
                            str3 = str2;
                            ResponseBody responseBody2 = (ResponseBody) obj;
                            File createTempFile2 = File.createTempFile("pronunciation_preview_", ".mp3");
                            createTempFile2.deleteOnExit();
                            FileOutputStream fileOutputStream2 = new FileOutputStream(createTempFile2);
                            InputStream a102 = responseBody2.a();
                            android.support.v4.media.session.b.j(a102, fileOutputStream2, UserMetadata.MAX_INTERNAL_KEY_SIZE);
                            a102.close();
                            fileOutputStream2.close();
                            String uri2 = createTempFile2.toURI().toString();
                            uri2.getClass();
                            map3 = this.this$0.previewCache;
                            map3.put(str3, uri2);
                            logger4 = this.this$0.logger;
                            logger4.log("PronunciationsService", defpackage.f.k("Cached pronunciation preview for: ", this.$text, " with voice: ", this.$voiceId));
                            return new AsyncCallResult.Success(uri2);
                        }
                        return aVar;
                    }
                } else {
                    j4 = (String) this.L$0;
                    sn.a.g(obj);
                }
            } else {
                sn.a.g(obj);
                j4 = defpackage.f.j(this.$text, ":", this.$voiceId);
                map = this.this$0.previewCache;
                String str5 = (String) map.get(j4);
                if (str5 != null) {
                    PronunciationsServiceImpl pronunciationsServiceImpl = this.this$0;
                    String str6 = this.$text;
                    String str7 = this.$voiceId;
                    if (new File(new URI(str5)).exists()) {
                        logger2 = pronunciationsServiceImpl.logger;
                        logger2.log("PronunciationsService", defpackage.f.k("Using cached pronunciation preview for: ", str6, " with voice: ", str7));
                        return new AsyncCallResult.Success(str5);
                    }
                    map2 = pronunciationsServiceImpl.previewCache;
                }
                appCheckTokenService = this.this$0.appCheckTokenService;
                this.L$0 = j4;
                this.label = 1;
                obj = appCheckTokenService.getAppCheckToken(this);
            }
            AppCheckTokenService.Result result = (AppCheckTokenService.Result) obj;
            if (result instanceof AppCheckTokenService.Result.Success) {
                String token = ((AppCheckTokenService.Result.Success) result).getToken();
                anonCaptchaTokenService = this.this$0.anonCaptchaTokenService;
                this.L$0 = j4;
                this.L$1 = token;
                this.label = 2;
                Object token2 = anonCaptchaTokenService.getToken(this);
                if (token2 != aVar) {
                    String str8 = j4;
                    str = token;
                    obj = token2;
                    str2 = str8;
                    String str42 = (String) obj;
                    PronunciationPreviewRequest pronunciationPreviewRequest2 = new PronunciationPreviewRequest(this.$text, this.$voiceId);
                    pronunciationsAPI = this.this$0.pronunciationsApi;
                    this.L$0 = str2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 3;
                    obj = pronunciationsAPI.previewPronunciation(str, str42, pronunciationPreviewRequest2, this);
                    if (obj != aVar) {
                    }
                }
                return aVar;
            }
            if (result instanceof AppCheckTokenService.Result.Error) {
                logger3 = this.this$0.logger;
                Logger.logWarning$default(logger3, "PronunciationsService", "Failed to get app check token", null, 4, null);
                return new AsyncCallResult.Error(AsyncCallResult.AsyncCallError.NetworkError.INSTANCE);
            }
            c6.p();
            return null;
        } catch (Exception e10) {
            logger = this.this$0.logger;
            logger.logWarning("PronunciationsService", defpackage.f.C("Failed to generate preview for '", this.$text, Separators.QUOTE), e10);
            return new AsyncCallResult.Error(AsyncCallResult.AsyncCallError.NetworkError.INSTANCE);
        }
    }
}
