package io.elevenlabs.player.drm;

import android.gov.nist.core.Separators;
import android.util.Base64;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.DrmService;
import io.elevenlabs.domain.services.DrmToken;
import j8.h;
import j8.p;
import j8.r;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.OkHttpClient;
import tg.b0;
import w7.j;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lio/elevenlabs/player/drm/AxinomDrmProvider;", "", "Lio/elevenlabs/domain/services/DrmService;", "drmService", "Lokhttp3/OkHttpClient;", "drmOkHttpClient", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/services/DrmService;Lokhttp3/OkHttpClient;Lio/elevenlabs/domain/Logger;)V", "", "readId", "fileNumber", "", "useDrm", "", "offlineKeySetId", "Lj8/r;", "createSessionManager", "(Ljava/lang/String;Ljava/lang/String;Z[B)Lj8/r;", "Lio/elevenlabs/domain/services/DrmService;", "Lokhttp3/OkHttpClient;", "Lio/elevenlabs/domain/Logger;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lio/elevenlabs/domain/services/DrmToken;", "tokenCache", "Ljava/util/concurrent/ConcurrentHashMap;", "getTokenCache", "()Ljava/util/concurrent/ConcurrentHashMap;", "Companion", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AxinomDrmProvider {
    private static final String TAG = "AxinomDrmProvider";
    private final OkHttpClient drmOkHttpClient;
    private final DrmService drmService;
    private final Logger logger;
    private final ConcurrentHashMap<String, DrmToken> tokenCache;

    public AxinomDrmProvider(DrmService drmService, OkHttpClient okHttpClient, Logger logger) {
        drmService.getClass();
        okHttpClient.getClass();
        logger.getClass();
        this.drmService = drmService;
        this.drmOkHttpClient = okHttpClient;
        this.logger = logger;
        this.tokenCache = new ConcurrentHashMap<>();
    }

    public static /* synthetic */ r createSessionManager$default(AxinomDrmProvider axinomDrmProvider, String str, String str2, boolean z6, byte[] bArr, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            bArr = null;
        }
        return axinomDrmProvider.createSessionManager(str, str2, z6, bArr);
    }

    public final r createSessionManager(String readId, String fileNumber, boolean useDrm, byte[] offlineKeySetId) {
        readId.getClass();
        fileNumber.getClass();
        p pVar = r.f18686a;
        if (!useDrm) {
            return pVar;
        }
        try {
            b0 b0Var = new b0(13);
            UUID uuid = j.f36393e;
            uuid.getClass();
            h hVar = new h(uuid, new AxinomMediaDrmCallback(readId, fileNumber, this.drmService, this.tokenCache, this.drmOkHttpClient, this.logger), new HashMap(), false, new int[0], true, b0Var);
            if (offlineKeySetId != null) {
                hVar.k(0, offlineKeySetId);
                String encodeToString = Base64.encodeToString(offlineKeySetId, 2);
                this.logger.log(TAG, "Using offline persistent license for " + readId + Separators.SLASH + fileNumber + " (keySetId=" + encodeToString + Separators.RPAREN);
                return hVar;
            }
            this.logger.log(TAG, "Using streaming DRM for " + readId + Separators.SLASH + fileNumber);
            return hVar;
        } catch (Exception e10) {
            this.logger.logError(TAG, "Failed to create DRM session manager: " + e10.getMessage(), e10);
            return pVar;
        }
    }

    public final ConcurrentHashMap<String, DrmToken> getTokenCache() {
        return this.tokenCache;
    }
}
