package io.livekit.android.token;

import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import et.d;
import ho.p;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.Date;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import xq.a;
import xq.b;
import xq.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a=\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012 \b\u0002\u0010\b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003j\u0002`\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a=\u0010\n\u001a\u00020\r*\u00020\f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012 \b\u0002\u0010\b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003j\u0002`\u0007¢\u0006\u0004\b\n\u0010\u000e\u001a(\u0010\u0015\u001a\u00020\u0006*\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\",\u0010\u0016\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017*2\u0010\u0018\"\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00032\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Lio/livekit/android/token/FixedTokenSource;", "Lio/livekit/android/token/TokenStore;", ProductResponseJsonKeys.STORE, "Lkotlin/Function2;", "Lio/livekit/android/token/TokenRequestOptions;", "Lio/livekit/android/token/TokenSourceResponse;", "", "Lio/livekit/android/token/TokenValidator;", "validator", "Lio/livekit/android/token/CachingFixedTokenSource;", "cached", "(Lio/livekit/android/token/FixedTokenSource;Lio/livekit/android/token/TokenStore;Lho/p;)Lio/livekit/android/token/CachingFixedTokenSource;", "Lio/livekit/android/token/ConfigurableTokenSource;", "Lio/livekit/android/token/CachingConfigurableTokenSource;", "(Lio/livekit/android/token/ConfigurableTokenSource;Lio/livekit/android/token/TokenStore;Lho/p;)Lio/livekit/android/token/CachingConfigurableTokenSource;", "Lxq/b;", "tolerance", "Ljava/util/Date;", "date", "hasValidToken-8Mi8wO0", "(Lio/livekit/android/token/TokenSourceResponse;JLjava/util/Date;)Z", "hasValidToken", "defaultValidator", "Lho/p;", "TokenValidator", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CachingTokenSourceKt {
    private static final p defaultValidator = CachingTokenSourceKt$defaultValidator$1.INSTANCE;

    public static final CachingFixedTokenSource cached(FixedTokenSource fixedTokenSource, TokenStore tokenStore, p pVar) {
        fixedTokenSource.getClass();
        tokenStore.getClass();
        pVar.getClass();
        return new CachingFixedTokenSource(fixedTokenSource, tokenStore, pVar);
    }

    public static /* synthetic */ CachingFixedTokenSource cached$default(FixedTokenSource fixedTokenSource, TokenStore tokenStore, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            tokenStore = new InMemoryTokenStore();
        }
        if ((i10 & 2) != 0) {
            pVar = defaultValidator;
        }
        return cached(fixedTokenSource, tokenStore, pVar);
    }

    /* renamed from: hasValidToken-8Mi8wO0, reason: not valid java name */
    public static final boolean m2633hasValidToken8Mi8wO0(TokenSourceResponse tokenSourceResponse, long j4, Date date) {
        Date date2;
        Date expiresAt;
        boolean z6;
        boolean z10;
        tokenSourceResponse.getClass();
        date.getClass();
        try {
            TokenPayload tokenPayload = new TokenPayload(tokenSourceResponse.getParticipantToken());
            date2 = new Date();
            expiresAt = tokenPayload.getExpiresAt();
            Date notBefore = tokenPayload.getNotBefore();
            if (notBefore != null && date2.before(notBefore)) {
                z6 = true;
            } else {
                z6 = false;
            }
        } catch (Exception e10) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.c(e10, "Could not validate existing token", new Object[0]);
            }
        }
        if (expiresAt != null) {
            if (date2.after(new Date(expiresAt.getTime() + b.d(j4)))) {
                z10 = true;
                if (!z6 || z10) {
                    return false;
                }
                return true;
            }
        }
        z10 = false;
        if (!z6) {
        }
        return false;
    }

    /* renamed from: hasValidToken-8Mi8wO0$default, reason: not valid java name */
    public static /* synthetic */ boolean m2634hasValidToken8Mi8wO0$default(TokenSourceResponse tokenSourceResponse, long j4, Date date, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            a aVar = b.f38124b;
            j4 = g.n(60, xq.d.SECONDS);
        }
        if ((i10 & 2) != 0) {
            date = new Date();
        }
        return m2633hasValidToken8Mi8wO0(tokenSourceResponse, j4, date);
    }

    public static final CachingConfigurableTokenSource cached(ConfigurableTokenSource configurableTokenSource, TokenStore tokenStore, p pVar) {
        configurableTokenSource.getClass();
        tokenStore.getClass();
        pVar.getClass();
        return new CachingConfigurableTokenSource(configurableTokenSource, tokenStore, pVar);
    }

    public static /* synthetic */ CachingConfigurableTokenSource cached$default(ConfigurableTokenSource configurableTokenSource, TokenStore tokenStore, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            tokenStore = new InMemoryTokenStore();
        }
        if ((i10 & 2) != 0) {
            pVar = defaultValidator;
        }
        return cached(configurableTokenSource, tokenStore, pVar);
    }
}
