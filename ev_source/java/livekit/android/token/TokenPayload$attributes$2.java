package io.livekit.android.token;

import ho.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class TokenPayload$attributes$2 extends n implements a {
    final /* synthetic */ TokenPayload this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenPayload$attributes$2(TokenPayload tokenPayload) {
        super(0);
        this.this$0 = tokenPayload;
    }

    @Override // ho.a
    public final Map<String, String> invoke() {
        Map<String, String> map;
        com.auth0.android.jwt.a aVar = (com.auth0.android.jwt.a) this.this$0.getJwt().f5168c.f5175g.get("attributes");
        if (aVar != null) {
            map = (Map) aVar.a(Map.class);
        } else {
            map = null;
        }
        if (!(map instanceof Map)) {
            return null;
        }
        return map;
    }
}
