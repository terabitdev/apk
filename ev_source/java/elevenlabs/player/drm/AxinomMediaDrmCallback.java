package io.elevenlabs.player.drm;

import a2.b;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.firebase.messaging.Constants;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import defpackage.f;
import fr.g0;
import ho.l;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.DrmService;
import io.elevenlabs.domain.services.DrmToken;
import j8.c0;
import j8.d0;
import j8.u;
import j8.v;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;
import sn.k;
import tn.a0;
import wn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&¨\u0006("}, d2 = {"Lio/elevenlabs/player/drm/AxinomMediaDrmCallback;", "Lj8/d0;", "", "readId", "fileNumber", "Lio/elevenlabs/domain/services/DrmService;", "drmService", "Ljava/util/concurrent/ConcurrentHashMap;", "Lio/elevenlabs/domain/services/DrmToken;", "tokenCache", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/services/DrmService;Ljava/util/concurrent/ConcurrentHashMap;Lokhttp3/OkHttpClient;Lio/elevenlabs/domain/Logger;)V", "url", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "headers", "requestType", "Lj8/c0;", "executeHttpRequest", "(Ljava/lang/String;[BLjava/util/Map;Ljava/lang/String;)Lj8/c0;", "Ljava/util/UUID;", "uuid", "Lj8/v;", "request", "executeProvisionRequest", "(Ljava/util/UUID;Lj8/v;)Lj8/c0;", "Lj8/u;", "executeKeyRequest", "(Ljava/util/UUID;Lj8/u;)Lj8/c0;", "Ljava/lang/String;", "Lio/elevenlabs/domain/services/DrmService;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lokhttp3/OkHttpClient;", "Lio/elevenlabs/domain/Logger;", "Companion", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AxinomMediaDrmCallback implements d0 {
    private static final String TAG = "AxinomMediaDrmCallback";
    private final DrmService drmService;
    private final String fileNumber;
    private final Logger logger;
    private final OkHttpClient okHttpClient;
    private final String readId;
    private final ConcurrentHashMap<String, DrmToken> tokenCache;

    public AxinomMediaDrmCallback(String str, String str2, DrmService drmService, ConcurrentHashMap<String, DrmToken> concurrentHashMap, OkHttpClient okHttpClient, Logger logger) {
        str.getClass();
        str2.getClass();
        drmService.getClass();
        concurrentHashMap.getClass();
        okHttpClient.getClass();
        logger.getClass();
        this.readId = str;
        this.fileNumber = str2;
        this.drmService = drmService;
        this.tokenCache = concurrentHashMap;
        this.okHttpClient = okHttpClient;
        this.logger = logger;
    }

    public static /* synthetic */ DrmToken a(b bVar, Object obj) {
        return executeKeyRequest$lambda$1(bVar, obj);
    }

    public static /* synthetic */ DrmToken b(AxinomMediaDrmCallback axinomMediaDrmCallback, String str) {
        return executeKeyRequest$lambda$0(axinomMediaDrmCallback, str);
    }

    private final c0 executeHttpRequest(String url, byte[] r72, Map<String, String> headers, String requestType) {
        Request.Builder builder = new Request.Builder();
        builder.f(url);
        builder.d(FirebasePerformance.HttpMethod.POST, RequestBody.Companion.c(RequestBody.INSTANCE, r72, null, 0, 7));
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            builder.a(entry.getKey(), entry.getValue());
        }
        OkHttpClient okHttpClient = this.okHttpClient;
        Request request = new Request(builder);
        okHttpClient.getClass();
        Response execute = FirebasePerfOkHttpClient.execute(new RealCall(okHttpClient, request, false));
        try {
            boolean z6 = execute.F0;
            int i10 = execute.f25426d;
            ResponseBody responseBody = execute.Y;
            if (!z6) {
                String E = responseBody.E();
                if (E.length() == 0) {
                    E = "No error body";
                }
                IOException iOException = new IOException(requestType + " request failed: HTTP " + i10 + " - " + E);
                Logger logger = this.logger;
                StringBuilder sb = new StringBuilder();
                sb.append(requestType);
                sb.append(" request failed: HTTP ");
                sb.append(i10);
                logger.logError(TAG, sb.toString(), iOException);
                throw iOException;
            }
            c0 c0Var = new c0(responseBody.h());
            execute.close();
            return c0Var;
        } finally {
        }
    }

    public static final DrmToken executeKeyRequest$lambda$0(AxinomMediaDrmCallback axinomMediaDrmCallback, String str) {
        str.getClass();
        return (DrmToken) g0.I(i.f37087a, new AxinomMediaDrmCallback$executeKeyRequest$drmToken$1$1(axinomMediaDrmCallback, null));
    }

    public static final DrmToken executeKeyRequest$lambda$1(l lVar, Object obj) {
        return (DrmToken) lVar.invoke(obj);
    }

    @Override // j8.d0
    public c0 executeKeyRequest(UUID uuid, u request) {
        uuid.getClass();
        request.getClass();
        DrmToken computeIfAbsent = this.tokenCache.computeIfAbsent(f.j(this.readId, ":", this.fileNumber), new a(new b(this, 24), 0));
        computeIfAbsent.getClass();
        DrmToken drmToken = computeIfAbsent;
        String widevineUrl = drmToken.getWidevineUrl();
        byte[] bArr = request.f18688a;
        bArr.getClass();
        return executeHttpRequest(widevineUrl, bArr, a0.J(new k("X-AxDRM-Message", drmToken.getToken()), new k(SIPHeaderNames.CONTENT_TYPE, "application/octet-stream")), "License");
    }

    @Override // j8.d0
    public c0 executeProvisionRequest(UUID uuid, v request) {
        uuid.getClass();
        request.getClass();
        byte[] bArr = request.f18690a;
        bArr.getClass();
        Charset charset = wq.b.f37231a;
        byte[] bytes = ("{\"signedRequest\":\"" + new String(bArr, charset) + "\"}").getBytes(charset);
        bytes.getClass();
        String str = request.f18691b;
        str.getClass();
        return executeHttpRequest(str, bytes, a0.J(new k(SIPHeaderNames.CONTENT_TYPE, "application/json; charset=utf-8"), new k(SIPHeaderNames.CONTENT_LENGTH, String.valueOf(bytes.length))), "Provisioning");
    }
}
