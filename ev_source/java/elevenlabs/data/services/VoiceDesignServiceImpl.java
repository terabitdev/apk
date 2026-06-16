package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import io.elevenlabs.data.api.VoiceDesignAPI;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.request.CreateVoiceDesignPreviewsRequest;
import io.elevenlabs.data.model.request.CreateVoiceFromPreviewRequest;
import io.elevenlabs.data.model.response.VoiceDesignCreateVoiceResponse;
import io.elevenlabs.data.model.response.VoiceDesignPreviewItem;
import io.elevenlabs.data.model.response.VoiceDesignPreviewsResponse;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.domain.services.AppCheckTokenService;
import io.elevenlabs.domain.services.VoiceDesignCreatedVoice;
import io.elevenlabs.domain.services.VoiceDesignPreview;
import io.elevenlabs.domain.services.VoiceDesignPreviewsResult;
import io.elevenlabs.domain.services.VoiceDesignService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import t2.u;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001a¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/data/services/VoiceDesignServiceImpl;", "Lio/elevenlabs/domain/services/VoiceDesignService;", "Lio/elevenlabs/data/api/VoiceDesignAPI;", "voiceDesignAPI", "Lio/elevenlabs/domain/services/AppCheckTokenService;", "appCheckTokenService", "Lio/elevenlabs/domain/services/AnonCaptchaTokenService;", "anonCaptchaTokenService", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/data/api/VoiceDesignAPI;Lio/elevenlabs/domain/services/AppCheckTokenService;Lio/elevenlabs/domain/services/AnonCaptchaTokenService;Lio/elevenlabs/domain/Logger;)V", "", "voiceDescription", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/services/VoiceDesignPreviewsResult;", "createPreviews", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "generatedVoiceId", "voiceName", "Lio/elevenlabs/domain/services/VoiceDesignCreatedVoice;", "createVoiceFromPreview", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/api/VoiceDesignAPI;", "Lio/elevenlabs/domain/services/AppCheckTokenService;", "Lio/elevenlabs/domain/services/AnonCaptchaTokenService;", "Lio/elevenlabs/domain/Logger;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class VoiceDesignServiceImpl implements VoiceDesignService {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String TAG = "VoiceDesignService";
    private final AnonCaptchaTokenService anonCaptchaTokenService;
    private final AppCheckTokenService appCheckTokenService;
    private final Logger logger;
    private final VoiceDesignAPI voiceDesignAPI;

    public VoiceDesignServiceImpl(VoiceDesignAPI voiceDesignAPI, AppCheckTokenService appCheckTokenService, AnonCaptchaTokenService anonCaptchaTokenService, Logger logger) {
        voiceDesignAPI.getClass();
        appCheckTokenService.getClass();
        anonCaptchaTokenService.getClass();
        logger.getClass();
        this.voiceDesignAPI = voiceDesignAPI;
        this.appCheckTokenService = appCheckTokenService;
        this.anonCaptchaTokenService = anonCaptchaTokenService;
        this.logger = logger;
    }

    public static /* synthetic */ VoiceDesignPreviewsResult a(VoiceDesignPreviewsResponse voiceDesignPreviewsResponse) {
        return createPreviews$lambda$0(voiceDesignPreviewsResponse);
    }

    public static /* synthetic */ VoiceDesignCreatedVoice b(VoiceDesignCreateVoiceResponse voiceDesignCreateVoiceResponse) {
        return createVoiceFromPreview$lambda$0(voiceDesignCreateVoiceResponse);
    }

    public static final VoiceDesignPreviewsResult createPreviews$lambda$0(VoiceDesignPreviewsResponse voiceDesignPreviewsResponse) {
        voiceDesignPreviewsResponse.getClass();
        List<VoiceDesignPreviewItem> previews = voiceDesignPreviewsResponse.getPreviews();
        ArrayList arrayList = new ArrayList(p.a0(previews, 10));
        for (VoiceDesignPreviewItem voiceDesignPreviewItem : previews) {
            arrayList.add(new VoiceDesignPreview(voiceDesignPreviewItem.getGeneratedVoiceId(), voiceDesignPreviewItem.getAudioBase64(), voiceDesignPreviewItem.getDurationSeconds()));
        }
        return new VoiceDesignPreviewsResult(arrayList, voiceDesignPreviewsResponse.getText());
    }

    public static final VoiceDesignCreatedVoice createVoiceFromPreview$lambda$0(VoiceDesignCreateVoiceResponse voiceDesignCreateVoiceResponse) {
        voiceDesignCreateVoiceResponse.getClass();
        return new VoiceDesignCreatedVoice(voiceDesignCreateVoiceResponse.getVoiceId(), voiceDesignCreateVoiceResponse.getName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b0, code lost:
    
        if (r15 != r6) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        if (r15 == r6) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.elevenlabs.domain.services.VoiceDesignService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createPreviews(String str, wn.c<? super AsyncCallResult<VoiceDesignPreviewsResult>> cVar) {
        VoiceDesignServiceImpl$createPreviews$1 voiceDesignServiceImpl$createPreviews$1;
        int i10;
        xn.a aVar;
        AppCheckTokenService.Result result;
        String str2;
        Object token;
        String str3;
        String str4;
        if (cVar instanceof VoiceDesignServiceImpl$createPreviews$1) {
            voiceDesignServiceImpl$createPreviews$1 = (VoiceDesignServiceImpl$createPreviews$1) cVar;
            int i11 = voiceDesignServiceImpl$createPreviews$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                voiceDesignServiceImpl$createPreviews$1.label = i11 - Integer.MIN_VALUE;
                Object obj = voiceDesignServiceImpl$createPreviews$1.result;
                i10 = voiceDesignServiceImpl$createPreviews$1.label;
                aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                sn.a.g(obj);
                                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new h(7));
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str4 = (String) voiceDesignServiceImpl$createPreviews$1.L$1;
                        String str5 = (String) voiceDesignServiceImpl$createPreviews$1.L$0;
                        sn.a.g(obj);
                        str3 = str5;
                        VoiceDesignAPI voiceDesignAPI = this.voiceDesignAPI;
                        CreateVoiceDesignPreviewsRequest createVoiceDesignPreviewsRequest = new CreateVoiceDesignPreviewsRequest(str3, u.P, u.P, 6, (kotlin.jvm.internal.f) null);
                        voiceDesignServiceImpl$createPreviews$1.L$0 = null;
                        voiceDesignServiceImpl$createPreviews$1.L$1 = null;
                        voiceDesignServiceImpl$createPreviews$1.L$2 = null;
                        voiceDesignServiceImpl$createPreviews$1.label = 3;
                        obj = voiceDesignAPI.createPreviews(str4, (String) obj, createVoiceDesignPreviewsRequest, voiceDesignServiceImpl$createPreviews$1);
                    } else {
                        str = (String) voiceDesignServiceImpl$createPreviews$1.L$0;
                        sn.a.g(obj);
                    }
                } else {
                    sn.a.g(obj);
                    AppCheckTokenService appCheckTokenService = this.appCheckTokenService;
                    voiceDesignServiceImpl$createPreviews$1.L$0 = str;
                    voiceDesignServiceImpl$createPreviews$1.label = 1;
                    obj = appCheckTokenService.getAppCheckToken(voiceDesignServiceImpl$createPreviews$1);
                }
                result = (AppCheckTokenService.Result) obj;
                if (!(result instanceof AppCheckTokenService.Result.Success)) {
                    str2 = ((AppCheckTokenService.Result.Success) result).getToken();
                } else if (result instanceof AppCheckTokenService.Result.Error) {
                    Logger.logWarning$default(this.logger, TAG, "Failed to get app check token", null, 4, null);
                    str2 = null;
                } else {
                    c6.p();
                    return null;
                }
                AnonCaptchaTokenService anonCaptchaTokenService = this.anonCaptchaTokenService;
                voiceDesignServiceImpl$createPreviews$1.L$0 = str;
                voiceDesignServiceImpl$createPreviews$1.L$1 = str2;
                voiceDesignServiceImpl$createPreviews$1.label = 2;
                token = anonCaptchaTokenService.getToken(voiceDesignServiceImpl$createPreviews$1);
                if (token != aVar) {
                    str3 = str;
                    str4 = str2;
                    obj = token;
                    VoiceDesignAPI voiceDesignAPI2 = this.voiceDesignAPI;
                    CreateVoiceDesignPreviewsRequest createVoiceDesignPreviewsRequest2 = new CreateVoiceDesignPreviewsRequest(str3, u.P, u.P, 6, (kotlin.jvm.internal.f) null);
                    voiceDesignServiceImpl$createPreviews$1.L$0 = null;
                    voiceDesignServiceImpl$createPreviews$1.L$1 = null;
                    voiceDesignServiceImpl$createPreviews$1.L$2 = null;
                    voiceDesignServiceImpl$createPreviews$1.label = 3;
                    obj = voiceDesignAPI2.createPreviews(str4, (String) obj, createVoiceDesignPreviewsRequest2, voiceDesignServiceImpl$createPreviews$1);
                }
                return aVar;
            }
        }
        voiceDesignServiceImpl$createPreviews$1 = new VoiceDesignServiceImpl$createPreviews$1(this, cVar);
        Object obj2 = voiceDesignServiceImpl$createPreviews$1.result;
        i10 = voiceDesignServiceImpl$createPreviews$1.label;
        aVar = xn.a.f37986a;
        if (i10 == 0) {
        }
        result = (AppCheckTokenService.Result) obj2;
        if (!(result instanceof AppCheckTokenService.Result.Success)) {
        }
        AnonCaptchaTokenService anonCaptchaTokenService2 = this.anonCaptchaTokenService;
        voiceDesignServiceImpl$createPreviews$1.L$0 = str;
        voiceDesignServiceImpl$createPreviews$1.L$1 = str2;
        voiceDesignServiceImpl$createPreviews$1.label = 2;
        token = anonCaptchaTokenService2.getToken(voiceDesignServiceImpl$createPreviews$1);
        if (token != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e7, code lost:
    
        if (r1 != r8) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // io.elevenlabs.domain.services.VoiceDesignService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createVoiceFromPreview(String str, String str2, String str3, wn.c<? super AsyncCallResult<VoiceDesignCreatedVoice>> cVar) {
        VoiceDesignServiceImpl$createVoiceFromPreview$1 voiceDesignServiceImpl$createVoiceFromPreview$1;
        int i10;
        xn.a aVar;
        String str4;
        String str5;
        String str6;
        AppCheckTokenService.Result result;
        String str7;
        Object token;
        String str8;
        String str9;
        String str10;
        if (cVar instanceof VoiceDesignServiceImpl$createVoiceFromPreview$1) {
            voiceDesignServiceImpl$createVoiceFromPreview$1 = (VoiceDesignServiceImpl$createVoiceFromPreview$1) cVar;
            int i11 = voiceDesignServiceImpl$createVoiceFromPreview$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                voiceDesignServiceImpl$createVoiceFromPreview$1.label = i11 - Integer.MIN_VALUE;
                Object obj = voiceDesignServiceImpl$createVoiceFromPreview$1.result;
                i10 = voiceDesignServiceImpl$createVoiceFromPreview$1.label;
                aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                sn.a.g(obj);
                                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new h(8));
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str10 = (String) voiceDesignServiceImpl$createVoiceFromPreview$1.L$3;
                        String str11 = (String) voiceDesignServiceImpl$createVoiceFromPreview$1.L$2;
                        str6 = (String) voiceDesignServiceImpl$createVoiceFromPreview$1.L$1;
                        String str12 = (String) voiceDesignServiceImpl$createVoiceFromPreview$1.L$0;
                        sn.a.g(obj);
                        str8 = str11;
                        str9 = str12;
                        String str13 = str6;
                        VoiceDesignAPI voiceDesignAPI = this.voiceDesignAPI;
                        CreateVoiceFromPreviewRequest createVoiceFromPreviewRequest = new CreateVoiceFromPreviewRequest(str9, str13, str8, (Map) null, 8, (kotlin.jvm.internal.f) null);
                        voiceDesignServiceImpl$createVoiceFromPreview$1.L$0 = null;
                        voiceDesignServiceImpl$createVoiceFromPreview$1.L$1 = null;
                        voiceDesignServiceImpl$createVoiceFromPreview$1.L$2 = null;
                        voiceDesignServiceImpl$createVoiceFromPreview$1.L$3 = null;
                        voiceDesignServiceImpl$createVoiceFromPreview$1.L$4 = null;
                        voiceDesignServiceImpl$createVoiceFromPreview$1.label = 3;
                        obj = voiceDesignAPI.createVoiceFromPreview(str10, (String) obj, createVoiceFromPreviewRequest, voiceDesignServiceImpl$createVoiceFromPreview$1);
                    } else {
                        String str14 = (String) voiceDesignServiceImpl$createVoiceFromPreview$1.L$2;
                        str6 = (String) voiceDesignServiceImpl$createVoiceFromPreview$1.L$1;
                        String str15 = (String) voiceDesignServiceImpl$createVoiceFromPreview$1.L$0;
                        sn.a.g(obj);
                        str5 = str14;
                        str4 = str15;
                    }
                } else {
                    sn.a.g(obj);
                    AppCheckTokenService appCheckTokenService = this.appCheckTokenService;
                    str4 = str;
                    voiceDesignServiceImpl$createVoiceFromPreview$1.L$0 = str4;
                    voiceDesignServiceImpl$createVoiceFromPreview$1.L$1 = str2;
                    str5 = str3;
                    voiceDesignServiceImpl$createVoiceFromPreview$1.L$2 = str5;
                    voiceDesignServiceImpl$createVoiceFromPreview$1.label = 1;
                    obj = appCheckTokenService.getAppCheckToken(voiceDesignServiceImpl$createVoiceFromPreview$1);
                    if (obj != aVar) {
                        str6 = str2;
                    }
                    return aVar;
                }
                result = (AppCheckTokenService.Result) obj;
                if (!(result instanceof AppCheckTokenService.Result.Success)) {
                    str7 = ((AppCheckTokenService.Result.Success) result).getToken();
                } else if (result instanceof AppCheckTokenService.Result.Error) {
                    Logger.logWarning$default(this.logger, TAG, "Failed to get app check token", null, 4, null);
                    str7 = null;
                } else {
                    c6.p();
                    return null;
                }
                AnonCaptchaTokenService anonCaptchaTokenService = this.anonCaptchaTokenService;
                voiceDesignServiceImpl$createVoiceFromPreview$1.L$0 = str4;
                voiceDesignServiceImpl$createVoiceFromPreview$1.L$1 = str6;
                voiceDesignServiceImpl$createVoiceFromPreview$1.L$2 = str5;
                voiceDesignServiceImpl$createVoiceFromPreview$1.L$3 = str7;
                voiceDesignServiceImpl$createVoiceFromPreview$1.label = 2;
                token = anonCaptchaTokenService.getToken(voiceDesignServiceImpl$createVoiceFromPreview$1);
                if (token != aVar) {
                    str8 = str5;
                    str9 = str4;
                    str10 = str7;
                    obj = token;
                    String str132 = str6;
                    VoiceDesignAPI voiceDesignAPI2 = this.voiceDesignAPI;
                    CreateVoiceFromPreviewRequest createVoiceFromPreviewRequest2 = new CreateVoiceFromPreviewRequest(str9, str132, str8, (Map) null, 8, (kotlin.jvm.internal.f) null);
                    voiceDesignServiceImpl$createVoiceFromPreview$1.L$0 = null;
                    voiceDesignServiceImpl$createVoiceFromPreview$1.L$1 = null;
                    voiceDesignServiceImpl$createVoiceFromPreview$1.L$2 = null;
                    voiceDesignServiceImpl$createVoiceFromPreview$1.L$3 = null;
                    voiceDesignServiceImpl$createVoiceFromPreview$1.L$4 = null;
                    voiceDesignServiceImpl$createVoiceFromPreview$1.label = 3;
                    obj = voiceDesignAPI2.createVoiceFromPreview(str10, (String) obj, createVoiceFromPreviewRequest2, voiceDesignServiceImpl$createVoiceFromPreview$1);
                }
                return aVar;
            }
        }
        voiceDesignServiceImpl$createVoiceFromPreview$1 = new VoiceDesignServiceImpl$createVoiceFromPreview$1(this, cVar);
        Object obj2 = voiceDesignServiceImpl$createVoiceFromPreview$1.result;
        i10 = voiceDesignServiceImpl$createVoiceFromPreview$1.label;
        aVar = xn.a.f37986a;
        if (i10 == 0) {
        }
        result = (AppCheckTokenService.Result) obj2;
        if (!(result instanceof AppCheckTokenService.Result.Success)) {
        }
        AnonCaptchaTokenService anonCaptchaTokenService2 = this.anonCaptchaTokenService;
        voiceDesignServiceImpl$createVoiceFromPreview$1.L$0 = str4;
        voiceDesignServiceImpl$createVoiceFromPreview$1.L$1 = str6;
        voiceDesignServiceImpl$createVoiceFromPreview$1.L$2 = str5;
        voiceDesignServiceImpl$createVoiceFromPreview$1.L$3 = str7;
        voiceDesignServiceImpl$createVoiceFromPreview$1.label = 2;
        token = anonCaptchaTokenService2.getToken(voiceDesignServiceImpl$createVoiceFromPreview$1);
        if (token != aVar) {
        }
        return aVar;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lio/elevenlabs/data/services/VoiceDesignServiceImpl$Companion;", "", "<init>", "()V", "TAG", "", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        private Companion() {
        }
    }
}
