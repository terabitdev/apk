package io.elevenlabs.data.services;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.protobuf.c6;
import fr.g0;
import io.elevenlabs.data.api.DrmAPI;
import io.elevenlabs.data.api.DrmTokenResponse;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.domain.ApiException;
import io.elevenlabs.domain.ApiExceptionKt;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.exceptions.ApiExceptionFactoryKt;
import io.elevenlabs.domain.services.DeviceUuidService;
import io.elevenlabs.domain.services.DrmService;
import io.elevenlabs.domain.services.DrmToken;
import io.elevenlabs.domain.services.LicenseType;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import livekit.LivekitInternal$NodeStats;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/data/services/DrmServiceImpl;", "Lio/elevenlabs/domain/services/DrmService;", "Lio/elevenlabs/data/api/DrmAPI;", "drmAPI", "Lio/elevenlabs/domain/services/DeviceUuidService;", "deviceUuidService", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/data/api/DrmAPI;Lio/elevenlabs/domain/services/DeviceUuidService;Lio/elevenlabs/domain/Logger;)V", "", "readId", "fileNumber", "Lio/elevenlabs/domain/services/LicenseType;", "licenseType", "Lio/elevenlabs/domain/services/DrmToken;", "getDrmToken", "(Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/services/LicenseType;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/api/DrmAPI;", "Lio/elevenlabs/domain/services/DeviceUuidService;", "Lio/elevenlabs/domain/Logger;", ParameterNames.TAG, "Ljava/lang/String;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class DrmServiceImpl implements DrmService {
    private static final Companion Companion = new Companion(null);
    private static final int MAX_RETRIES = 3;
    private final DeviceUuidService deviceUuidService;
    private final DrmAPI drmAPI;
    private final Logger logger;
    private final String tag;

    public DrmServiceImpl(DrmAPI drmAPI, DeviceUuidService deviceUuidService, Logger logger) {
        drmAPI.getClass();
        deviceUuidService.getClass();
        logger.getClass();
        this.drmAPI = drmAPI;
        this.deviceUuidService = deviceUuidService;
        this.logger = logger;
        this.tag = "DrmService";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x020e -> B:13:0x0215). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0205 -> B:12:0x0208). Please report as a decompilation issue!!! */
    @Override // io.elevenlabs.domain.services.DrmService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getDrmToken(String str, String str2, LicenseType licenseType, wn.c<? super DrmToken> cVar) {
        DrmServiceImpl$getDrmToken$1 drmServiceImpl$getDrmToken$1;
        int i10;
        String str3;
        String str4;
        DrmServiceImpl$getDrmToken$1 drmServiceImpl$getDrmToken$12;
        int i11;
        int i12;
        d0 obj;
        LicenseType licenseType2;
        String str5;
        LicenseType licenseType3;
        String str6;
        int i13;
        d0 d0Var;
        int i14;
        int i15;
        ApiResult apiResult;
        int i16;
        xn.a aVar;
        char c5;
        Object obj2;
        int i17;
        d0 d0Var2;
        DrmServiceImpl drmServiceImpl = this;
        if (cVar instanceof DrmServiceImpl$getDrmToken$1) {
            drmServiceImpl$getDrmToken$1 = (DrmServiceImpl$getDrmToken$1) cVar;
            int i18 = drmServiceImpl$getDrmToken$1.label;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                drmServiceImpl$getDrmToken$1.label = i18 - Integer.MIN_VALUE;
                Object obj3 = drmServiceImpl$getDrmToken$1.result;
                i10 = drmServiceImpl$getDrmToken$1.label;
                int i19 = 0;
                Object obj4 = null;
                int i20 = 1;
                xn.a aVar2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                i11 = drmServiceImpl$getDrmToken$1.I$1;
                                i17 = drmServiceImpl$getDrmToken$1.I$0;
                                d0Var = (d0) drmServiceImpl$getDrmToken$1.L$3;
                                LicenseType licenseType4 = (LicenseType) drmServiceImpl$getDrmToken$1.L$2;
                                str6 = (String) drmServiceImpl$getDrmToken$1.L$1;
                                String str7 = (String) drmServiceImpl$getDrmToken$1.L$0;
                                sn.a.g(obj3);
                                c5 = 2;
                                i16 = 1;
                                aVar = aVar2;
                                obj2 = null;
                                drmServiceImpl$getDrmToken$12 = drmServiceImpl$getDrmToken$1;
                                d0Var2 = d0Var;
                                licenseType2 = licenseType4;
                                str4 = str6;
                                str3 = str7;
                                i11++;
                                obj4 = obj2;
                                i12 = i17;
                                i20 = i16;
                                aVar2 = aVar;
                                i19 = 0;
                                obj = d0Var2;
                                if (i11 >= i12) {
                                    DrmAPI drmAPI = drmServiceImpl.drmAPI;
                                    String uuid = drmServiceImpl.deviceUuidService.getUuid();
                                    String value = licenseType2.getValue();
                                    drmServiceImpl$getDrmToken$12.L$0 = str3;
                                    drmServiceImpl$getDrmToken$12.L$1 = str4;
                                    drmServiceImpl$getDrmToken$12.L$2 = licenseType2;
                                    drmServiceImpl$getDrmToken$12.L$3 = obj;
                                    drmServiceImpl$getDrmToken$12.L$4 = obj4;
                                    drmServiceImpl$getDrmToken$12.L$5 = obj4;
                                    drmServiceImpl$getDrmToken$12.I$0 = i12;
                                    drmServiceImpl$getDrmToken$12.I$1 = i11;
                                    drmServiceImpl$getDrmToken$12.I$2 = i11;
                                    drmServiceImpl$getDrmToken$12.I$3 = i19;
                                    drmServiceImpl$getDrmToken$12.label = i20;
                                    Object drmToken = drmAPI.getDrmToken(str3, str4, uuid, value, drmServiceImpl$getDrmToken$12);
                                    if (drmToken == aVar2) {
                                        return aVar2;
                                    }
                                    String str8 = str3;
                                    d0Var = obj;
                                    drmServiceImpl$getDrmToken$1 = drmServiceImpl$getDrmToken$12;
                                    str5 = str8;
                                    licenseType3 = licenseType2;
                                    obj3 = drmToken;
                                    str6 = str4;
                                    i14 = i11;
                                    i13 = i12;
                                    i15 = i19;
                                    apiResult = (ApiResult) obj3;
                                    if (apiResult instanceof ApiResult.Success) {
                                        ApiResult.Success success = (ApiResult.Success) apiResult;
                                        return new DrmToken(((DrmTokenResponse) success.getData()).getToken(), ((DrmTokenResponse) success.getData()).getContentKeyId(), ((DrmTokenResponse) success.getData()).getExpiresAtUnix(), ((DrmTokenResponse) success.getData()).getWidevineUrl());
                                    }
                                    if (apiResult instanceof ApiResult.Error.ApiError) {
                                        ApiResult.Error.ApiError apiError = (ApiResult.Error.ApiError) apiResult;
                                        i16 = i20;
                                        ApiException apiExceptionFor = ApiExceptionFactoryKt.apiExceptionFor(apiError.getCode(), apiError.getMessage());
                                        boolean contains = ApiExceptionKt.getPERMANENT_API_ERRORS().contains(apiError.getCode());
                                        Logger logger = drmServiceImpl.logger;
                                        if (!contains) {
                                            int i21 = i14 + 1;
                                            xn.a aVar3 = aVar2;
                                            logger.log(drmServiceImpl.tag, n.h(i21, "Transient DRM error (attempt ", "/3): ", apiError.getCode()));
                                            d0Var.f20559a = apiExceptionFor;
                                            if (i14 < 2) {
                                                drmServiceImpl$getDrmToken$1.L$0 = str5;
                                                drmServiceImpl$getDrmToken$1.L$1 = str6;
                                                drmServiceImpl$getDrmToken$1.L$2 = licenseType3;
                                                drmServiceImpl$getDrmToken$1.L$3 = d0Var;
                                                drmServiceImpl$getDrmToken$1.L$4 = null;
                                                drmServiceImpl$getDrmToken$1.L$5 = null;
                                                drmServiceImpl$getDrmToken$1.I$0 = i13;
                                                drmServiceImpl$getDrmToken$1.I$1 = i11;
                                                drmServiceImpl$getDrmToken$1.I$2 = i14;
                                                drmServiceImpl$getDrmToken$1.I$3 = i15;
                                                drmServiceImpl$getDrmToken$1.label = 2;
                                                Object m10 = g0.m(i21 * 1000, drmServiceImpl$getDrmToken$1);
                                                aVar = aVar3;
                                                if (m10 != aVar) {
                                                    i17 = i13;
                                                    LicenseType licenseType5 = licenseType3;
                                                    String str9 = str5;
                                                    drmServiceImpl = this;
                                                    drmServiceImpl$getDrmToken$12 = drmServiceImpl$getDrmToken$1;
                                                    d0Var2 = d0Var;
                                                    licenseType2 = licenseType5;
                                                    str4 = str6;
                                                    str3 = str9;
                                                    c5 = 2;
                                                    obj2 = null;
                                                    i11++;
                                                    obj4 = obj2;
                                                    i12 = i17;
                                                    i20 = i16;
                                                    aVar2 = aVar;
                                                    i19 = 0;
                                                    obj = d0Var2;
                                                    if (i11 >= i12) {
                                                        Exception exc = (Exception) obj.f20559a;
                                                        if (exc != null) {
                                                            throw exc;
                                                        }
                                                        throw new IOException("Failed to fetch DRM token after 3 attempts");
                                                    }
                                                } else {
                                                    return aVar;
                                                }
                                            } else {
                                                aVar = aVar3;
                                                c5 = 2;
                                                drmServiceImpl = this;
                                            }
                                        } else {
                                            logger.logError(drmServiceImpl.tag, "Permanent DRM error: " + apiError.getCode(), apiExceptionFor);
                                            throw apiExceptionFor;
                                        }
                                    } else {
                                        i16 = i20;
                                        aVar = aVar2;
                                        if (apiResult instanceof ApiResult.Error.NetworkError) {
                                            int i22 = i14 + 1;
                                            drmServiceImpl.logger.log(drmServiceImpl.tag, "Network error fetching DRM token (attempt " + i22 + "/3)");
                                            d0Var.f20559a = new IOException("Network error fetching DRM token");
                                            c5 = 2;
                                            if (i14 < 2) {
                                                drmServiceImpl$getDrmToken$1.L$0 = str5;
                                                drmServiceImpl$getDrmToken$1.L$1 = str6;
                                                drmServiceImpl$getDrmToken$1.L$2 = licenseType3;
                                                drmServiceImpl$getDrmToken$1.L$3 = d0Var;
                                                obj2 = null;
                                                drmServiceImpl$getDrmToken$1.L$4 = null;
                                                drmServiceImpl$getDrmToken$1.I$0 = i13;
                                                drmServiceImpl$getDrmToken$1.I$1 = i11;
                                                drmServiceImpl$getDrmToken$1.I$2 = i14;
                                                drmServiceImpl$getDrmToken$1.I$3 = i15;
                                                drmServiceImpl$getDrmToken$1.label = 3;
                                                if (g0.m(i22 * 1000, drmServiceImpl$getDrmToken$1) == aVar) {
                                                    return aVar;
                                                }
                                                i17 = i13;
                                                licenseType4 = licenseType3;
                                                str7 = str5;
                                                drmServiceImpl$getDrmToken$12 = drmServiceImpl$getDrmToken$1;
                                                d0Var2 = d0Var;
                                                licenseType2 = licenseType4;
                                                str4 = str6;
                                                str3 = str7;
                                                i11++;
                                                obj4 = obj2;
                                                i12 = i17;
                                                i20 = i16;
                                                aVar2 = aVar;
                                                i19 = 0;
                                                obj = d0Var2;
                                                if (i11 >= i12) {
                                                }
                                            }
                                        } else {
                                            if (apiResult instanceof ApiResult.Error.UnknownError) {
                                                c6.z(((ApiResult.Error.UnknownError) apiResult).getMessage());
                                                return null;
                                            }
                                            c6.p();
                                            return null;
                                        }
                                    }
                                    obj2 = null;
                                    String str10 = str5;
                                    drmServiceImpl$getDrmToken$12 = drmServiceImpl$getDrmToken$1;
                                    d0Var2 = d0Var;
                                    str3 = str10;
                                    i17 = i13;
                                    str4 = str6;
                                    licenseType2 = licenseType3;
                                    i11++;
                                    obj4 = obj2;
                                    i12 = i17;
                                    i20 = i16;
                                    aVar2 = aVar;
                                    i19 = 0;
                                    obj = d0Var2;
                                    if (i11 >= i12) {
                                    }
                                }
                            } else {
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            i11 = drmServiceImpl$getDrmToken$1.I$1;
                            i17 = drmServiceImpl$getDrmToken$1.I$0;
                            d0 d0Var3 = (d0) drmServiceImpl$getDrmToken$1.L$3;
                            LicenseType licenseType6 = (LicenseType) drmServiceImpl$getDrmToken$1.L$2;
                            String str11 = (String) drmServiceImpl$getDrmToken$1.L$1;
                            String str12 = (String) drmServiceImpl$getDrmToken$1.L$0;
                            sn.a.g(obj3);
                            i16 = 1;
                            aVar = aVar2;
                            drmServiceImpl = this;
                            drmServiceImpl$getDrmToken$12 = drmServiceImpl$getDrmToken$1;
                            d0Var2 = d0Var3;
                            licenseType2 = licenseType6;
                            str4 = str11;
                            str3 = str12;
                            c5 = 2;
                            obj2 = null;
                            i11++;
                            obj4 = obj2;
                            i12 = i17;
                            i20 = i16;
                            aVar2 = aVar;
                            i19 = 0;
                            obj = d0Var2;
                            if (i11 >= i12) {
                            }
                        }
                    } else {
                        int i23 = drmServiceImpl$getDrmToken$1.I$3;
                        i14 = drmServiceImpl$getDrmToken$1.I$2;
                        int i24 = drmServiceImpl$getDrmToken$1.I$1;
                        i13 = drmServiceImpl$getDrmToken$1.I$0;
                        d0 d0Var4 = (d0) drmServiceImpl$getDrmToken$1.L$3;
                        licenseType3 = (LicenseType) drmServiceImpl$getDrmToken$1.L$2;
                        String str13 = (String) drmServiceImpl$getDrmToken$1.L$1;
                        String str14 = (String) drmServiceImpl$getDrmToken$1.L$0;
                        sn.a.g(obj3);
                        i15 = i23;
                        i11 = i24;
                        d0Var = d0Var4;
                        str6 = str13;
                        str5 = str14;
                        apiResult = (ApiResult) obj3;
                        if (apiResult instanceof ApiResult.Success) {
                        }
                    }
                } else {
                    sn.a.g(obj3);
                    str3 = str;
                    str4 = str2;
                    drmServiceImpl$getDrmToken$12 = drmServiceImpl$getDrmToken$1;
                    i11 = 0;
                    i12 = 3;
                    obj = new Object();
                    licenseType2 = licenseType;
                    if (i11 >= i12) {
                    }
                }
            }
        }
        drmServiceImpl$getDrmToken$1 = new DrmServiceImpl$getDrmToken$1(drmServiceImpl, cVar);
        Object obj32 = drmServiceImpl$getDrmToken$1.result;
        i10 = drmServiceImpl$getDrmToken$1.label;
        int i192 = 0;
        Object obj42 = null;
        int i202 = 1;
        xn.a aVar22 = xn.a.f37986a;
        if (i10 == 0) {
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lio/elevenlabs/data/services/DrmServiceImpl$Companion;", "", "<init>", "()V", "MAX_RETRIES", "", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        private Companion() {
        }
    }
}
