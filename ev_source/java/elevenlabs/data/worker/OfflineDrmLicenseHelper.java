package io.elevenlabs.data.worker;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.util.Base64;
import androidx.room.m0;
import com.google.firebase.messaging.Constants;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.protobuf.c6;
import defpackage.f;
import ib.i;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.DrmService;
import io.elevenlabs.domain.services.DrmToken;
import io.elevenlabs.domain.services.LicenseType;
import j8.c0;
import j8.d0;
import j8.g0;
import j8.h;
import j8.u;
import j8.v;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.RealCall;
import oo.f0;
import rd.c1;
import sn.k;
import t9.p;
import tg.b0;
import tn.a0;
import tn.n;
import tn.o;
import ur.g1;
import ur.h0;
import w7.j;
import w7.q;
import w7.r;
import w7.w;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002.-B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u0017*\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\"\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH\u0086@¢\u0006\u0004\b\"\u0010#J(\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lio/elevenlabs/data/worker/OfflineDrmLicenseHelper;", "", "Lio/elevenlabs/domain/services/DrmService;", "drmService", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/services/DrmService;Lio/elevenlabs/domain/Logger;)V", "Lj8/d0;", "callback", "Lj8/g0;", "createHelper", "(Lj8/d0;)Lj8/g0;", "", "contentKeyId", "Lw7/w;", "buildFormatWithPssh", "(Ljava/lang/String;)Lw7/w;", "Lio/elevenlabs/domain/services/DrmToken;", "drmToken", "buildCallback", "(Lio/elevenlabs/domain/services/DrmToken;)Lj8/d0;", "url", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "headers", "Lj8/c0;", "executeHttpPost", "(Ljava/lang/String;[BLjava/util/Map;)Lj8/c0;", "hexToByteArray", "(Ljava/lang/String;)[B", "readId", "fileNumber", "downloadLicense", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "keySetId", "", "releaseLicense", "(Ljava/lang/String;Ljava/lang/String;[BLwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/services/DrmService;", "Lio/elevenlabs/domain/Logger;", "Lokhttp3/OkHttpClient;", "httpClient", "Lokhttp3/OkHttpClient;", "Companion", "FallbackDrmCallback", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OfflineDrmLicenseHelper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "OfflineDrmLicenseHelper";
    private final DrmService drmService;
    private final OkHttpClient httpClient;
    private final Logger logger;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/elevenlabs/data/worker/OfflineDrmLicenseHelper$FallbackDrmCallback;", "Lj8/d0;", "<init>", "()V", "Ljava/util/UUID;", "uuid", "Lj8/v;", "request", "Lj8/c0;", "executeProvisionRequest", "(Ljava/util/UUID;Lj8/v;)Lj8/c0;", "Lj8/u;", "executeKeyRequest", "(Ljava/util/UUID;Lj8/u;)Lj8/c0;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class FallbackDrmCallback implements d0 {
        public static final FallbackDrmCallback INSTANCE = new FallbackDrmCallback();

        private FallbackDrmCallback() {
        }

        @Override // j8.d0
        public c0 executeKeyRequest(UUID uuid, u request) {
            uuid.getClass();
            request.getClass();
            return new c0(new byte[0]);
        }

        @Override // j8.d0
        public c0 executeProvisionRequest(UUID uuid, v request) {
            uuid.getClass();
            request.getClass();
            return new c0(new byte[0]);
        }
    }

    public OfflineDrmLicenseHelper(DrmService drmService, Logger logger) {
        drmService.getClass();
        logger.getClass();
        this.drmService = drmService;
        this.logger = logger;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        builder.f25388x = _UtilJvmKt.b(15L, timeUnit);
        timeUnit.getClass();
        builder.f25389y = _UtilJvmKt.b(15L, timeUnit);
        this.httpClient = new OkHttpClient(builder);
    }

    private final d0 buildCallback(final DrmToken drmToken) {
        return new d0() { // from class: io.elevenlabs.data.worker.OfflineDrmLicenseHelper$buildCallback$1
            @Override // j8.d0
            public c0 executeKeyRequest(UUID uuid, u request) {
                c0 executeHttpPost;
                uuid.getClass();
                request.getClass();
                OfflineDrmLicenseHelper offlineDrmLicenseHelper = OfflineDrmLicenseHelper.this;
                String widevineUrl = drmToken.getWidevineUrl();
                byte[] bArr = request.f18688a;
                bArr.getClass();
                executeHttpPost = offlineDrmLicenseHelper.executeHttpPost(widevineUrl, bArr, a0.J(new k("X-AxDRM-Message", drmToken.getToken()), new k(SIPHeaderNames.CONTENT_TYPE, "application/octet-stream")));
                return executeHttpPost;
            }

            @Override // j8.d0
            public c0 executeProvisionRequest(UUID uuid, v request) {
                c0 executeHttpPost;
                uuid.getClass();
                request.getClass();
                byte[] bArr = request.f18690a;
                bArr.getClass();
                Charset charset = wq.b.f37231a;
                byte[] bytes = ("{\"signedRequest\":\"" + new String(bArr, charset) + "\"}").getBytes(charset);
                bytes.getClass();
                OfflineDrmLicenseHelper offlineDrmLicenseHelper = OfflineDrmLicenseHelper.this;
                String str = request.f18691b;
                executeHttpPost = offlineDrmLicenseHelper.executeHttpPost(str, bytes, i.l(str, SIPHeaderNames.CONTENT_TYPE, "application/json; charset=utf-8"));
                return executeHttpPost;
            }
        };
    }

    private final w buildFormatWithPssh(String contentKeyId) {
        byte[] hexToByteArray = hexToByteArray(wq.u.T(contentKeyId, "-", ""));
        byte[] U0 = n.U0(new byte[]{18, (byte) hexToByteArray.length}, hexToByteArray);
        UUID uuid = j.f36393e;
        byte[] a10 = p.a(uuid, null, U0);
        a10.getClass();
        q qVar = new q(uuid, null, "video/mp4", a10);
        w7.v vVar = new w7.v();
        vVar.f36696r = new r(qVar);
        return new w(vVar);
    }

    private final g0 createHelper(d0 callback) {
        b0 b0Var = new b0(13);
        UUID uuid = j.f36393e;
        uuid.getClass();
        return new g0(new h(uuid, callback, new HashMap(), false, new int[0], true, b0Var), new j8.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c0 executeHttpPost(String url, byte[] data, Map<String, String> headers) {
        Request.Builder builder = new Request.Builder();
        builder.f(url);
        builder.d(FirebasePerformance.HttpMethod.POST, RequestBody.Companion.c(RequestBody.INSTANCE, data, null, 0, 7));
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            builder.a(entry.getKey(), entry.getValue());
        }
        OkHttpClient okHttpClient = this.httpClient;
        Request request = new Request(builder);
        okHttpClient.getClass();
        Response execute = FirebasePerfOkHttpClient.execute(new RealCall(okHttpClient, request, false));
        try {
            boolean z6 = execute.F0;
            ResponseBody responseBody = execute.Y;
            if (z6) {
                c0 c0Var = new c0(responseBody.h());
                execute.close();
                return c0Var;
            }
            String J0 = wq.n.J0(500, responseBody.E());
            throw new IOException("DRM license request failed: HTTP " + execute.f25426d + " - " + J0);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                m0.o(execute, th);
                throw th2;
            }
        }
    }

    private final byte[] hexToByteArray(String str) {
        if (str.length() % 2 == 0) {
            ArrayList N0 = wq.n.N0(2, 2, str);
            ArrayList arrayList = new ArrayList(tn.p.a0(N0, 10));
            Iterator it = N0.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                f0.A(16);
                arrayList.add(Byte.valueOf((byte) Integer.parseInt(str2, 16)));
            }
            return o.d1(arrayList);
        }
        c6.x("Hex string must have even length");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object downloadLicense(String str, String str2, c<? super byte[]> cVar) {
        OfflineDrmLicenseHelper$downloadLicense$1 offlineDrmLicenseHelper$downloadLicense$1;
        int i10;
        g0 createHelper;
        byte[] a10;
        try {
            if (cVar instanceof OfflineDrmLicenseHelper$downloadLicense$1) {
                offlineDrmLicenseHelper$downloadLicense$1 = (OfflineDrmLicenseHelper$downloadLicense$1) cVar;
                int i11 = offlineDrmLicenseHelper$downloadLicense$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    offlineDrmLicenseHelper$downloadLicense$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = offlineDrmLicenseHelper$downloadLicense$1.result;
                    xn.a aVar = xn.a.f37986a;
                    i10 = offlineDrmLicenseHelper$downloadLicense$1.label;
                    boolean z6 = true;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            str2 = (String) offlineDrmLicenseHelper$downloadLicense$1.L$1;
                            str = (String) offlineDrmLicenseHelper$downloadLicense$1.L$0;
                            sn.a.g(obj);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        DrmService drmService = this.drmService;
                        LicenseType licenseType = LicenseType.DOWNLOAD;
                        offlineDrmLicenseHelper$downloadLicense$1.L$0 = str;
                        offlineDrmLicenseHelper$downloadLicense$1.L$1 = str2;
                        offlineDrmLicenseHelper$downloadLicense$1.label = 1;
                        obj = drmService.getDrmToken(str, str2, licenseType, offlineDrmLicenseHelper$downloadLicense$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    DrmToken drmToken = (DrmToken) obj;
                    w buildFormatWithPssh = buildFormatWithPssh(drmToken.getContentKeyId());
                    createHelper = createHelper(buildCallback(drmToken));
                    synchronized (createHelper) {
                        if (buildFormatWithPssh.f36773s == null) {
                            z6 = false;
                        }
                        gg.b.p(z6);
                        a10 = createHelper.a(2, buildFormatWithPssh, null);
                    }
                    this.logger.log(TAG, "Acquired persistent license for " + str + Separators.SLASH + str2);
                    return a10;
                }
            }
            synchronized (createHelper) {
            }
        } finally {
            createHelper.f18647c.quit();
        }
        offlineDrmLicenseHelper$downloadLicense$1 = new OfflineDrmLicenseHelper$downloadLicense$1(this, cVar);
        Object obj2 = offlineDrmLicenseHelper$downloadLicense$1.result;
        xn.a aVar2 = xn.a.f37986a;
        i10 = offlineDrmLicenseHelper$downloadLicense$1.label;
        boolean z62 = true;
        if (i10 == 0) {
        }
        DrmToken drmToken2 = (DrmToken) obj2;
        w buildFormatWithPssh2 = buildFormatWithPssh(drmToken2.getContentKeyId());
        createHelper = createHelper(buildCallback(drmToken2));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object releaseLicense(String str, String str2, byte[] bArr, c<? super Boolean> cVar) {
        OfflineDrmLicenseHelper$releaseLicense$1 offlineDrmLicenseHelper$releaseLicense$1;
        int i10;
        String str3;
        Exception e10;
        OfflineDrmLicenseHelper offlineDrmLicenseHelper;
        d0 d0Var;
        g0 createHelper;
        try {
            if (cVar instanceof OfflineDrmLicenseHelper$releaseLicense$1) {
                offlineDrmLicenseHelper$releaseLicense$1 = (OfflineDrmLicenseHelper$releaseLicense$1) cVar;
                int i11 = offlineDrmLicenseHelper$releaseLicense$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    offlineDrmLicenseHelper$releaseLicense$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = offlineDrmLicenseHelper$releaseLicense$1.result;
                    xn.a aVar = xn.a.f37986a;
                    i10 = offlineDrmLicenseHelper$releaseLicense$1.label;
                    boolean z6 = true;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            offlineDrmLicenseHelper = (OfflineDrmLicenseHelper) offlineDrmLicenseHelper$releaseLicense$1.L$3;
                            bArr = (byte[]) offlineDrmLicenseHelper$releaseLicense$1.L$2;
                            str2 = (String) offlineDrmLicenseHelper$releaseLicense$1.L$1;
                            str3 = (String) offlineDrmLicenseHelper$releaseLicense$1.L$0;
                            try {
                                sn.a.g(obj);
                            } catch (Exception e11) {
                                e10 = e11;
                                try {
                                    this.logger.logWarning(TAG, "Token fetch failed for release (" + str3 + Separators.SLASH + str2 + "), using fallback", e10);
                                    d0Var = FallbackDrmCallback.INSTANCE;
                                    createHelper = createHelper(d0Var);
                                    synchronized (createHelper) {
                                    }
                                } catch (Exception e12) {
                                    this.logger.logError(TAG, f.l(e0.f20562a.b(e12.getClass()).n(), Separators.RPAREN, f.s("Failed to release DRM license for ", str3, Separators.SLASH, str2, " (")), e12);
                                    z6 = false;
                                }
                            }
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        try {
                            DrmService drmService = this.drmService;
                            LicenseType licenseType = LicenseType.DOWNLOAD;
                            offlineDrmLicenseHelper$releaseLicense$1.L$0 = str;
                            offlineDrmLicenseHelper$releaseLicense$1.L$1 = str2;
                            offlineDrmLicenseHelper$releaseLicense$1.L$2 = bArr;
                            offlineDrmLicenseHelper$releaseLicense$1.L$3 = this;
                            offlineDrmLicenseHelper$releaseLicense$1.label = 1;
                            obj = drmService.getDrmToken(str, str2, licenseType, offlineDrmLicenseHelper$releaseLicense$1);
                            if (obj == aVar) {
                                return aVar;
                            }
                            str3 = str;
                            offlineDrmLicenseHelper = this;
                        } catch (Exception e13) {
                            str3 = str;
                            e10 = e13;
                            this.logger.logWarning(TAG, "Token fetch failed for release (" + str3 + Separators.SLASH + str2 + "), using fallback", e10);
                            d0Var = FallbackDrmCallback.INSTANCE;
                            createHelper = createHelper(d0Var);
                            synchronized (createHelper) {
                            }
                        }
                    }
                    d0Var = offlineDrmLicenseHelper.buildCallback((DrmToken) obj);
                    createHelper = createHelper(d0Var);
                    synchronized (createHelper) {
                        bArr.getClass();
                        createHelper.a(3, g0.f18644f, bArr);
                    }
                    this.logger.log(TAG, "Released persistent license for " + str3 + Separators.SLASH + str2);
                    return Boolean.valueOf(z6);
                }
            }
            synchronized (createHelper) {
            }
        } finally {
            createHelper.f18647c.quit();
        }
        offlineDrmLicenseHelper$releaseLicense$1 = new OfflineDrmLicenseHelper$releaseLicense$1(this, cVar);
        Object obj2 = offlineDrmLicenseHelper$releaseLicense$1.result;
        xn.a aVar2 = xn.a.f37986a;
        i10 = offlineDrmLicenseHelper$releaseLicense$1.label;
        boolean z62 = true;
        if (i10 == 0) {
        }
        d0Var = offlineDrmLicenseHelper.buildCallback((DrmToken) obj2);
        createHelper = createHelper(d0Var);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bJ\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/elevenlabs/data/worker/OfflineDrmLicenseHelper$Companion;", "", "<init>", "()V", "TAG", "", "encodeDrmKeySetIds", "ids", "", "", "decodeDrmKeySetIds", "json", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final Map<String, byte[]> decodeDrmKeySetIds(String json) {
            json.getClass();
            try {
                vr.b bVar = vr.c.f35855d;
                bVar.getClass();
                g1 g1Var = g1.f34588a;
                Map map = (Map) bVar.b(json, new h0(g1Var, g1Var));
                LinkedHashMap linkedHashMap = new LinkedHashMap(a0.H(map.size()));
                for (Object obj : map.entrySet()) {
                    linkedHashMap.put(((Map.Entry) obj).getKey(), Base64.decode((String) ((Map.Entry) obj).getValue(), 2));
                }
                return linkedHashMap;
            } catch (Exception unused) {
                return tn.u.f33548a;
            }
        }

        public final String encodeDrmKeySetIds(Map<String, byte[]> ids) {
            ids.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(a0.H(ids.size()));
            Iterator<T> it = ids.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), Base64.encodeToString((byte[]) entry.getValue(), 2));
            }
            vr.b bVar = vr.c.f35855d;
            bVar.getClass();
            g1 g1Var = g1.f34588a;
            return bVar.d(new h0(g1Var, c1.w(g1Var)), linkedHashMap);
        }

        private Companion() {
        }
    }
}
