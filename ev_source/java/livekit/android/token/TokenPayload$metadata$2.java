package io.livekit.android.token;

import com.google.gson.f;
import com.google.gson.j;
import ho.a;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class TokenPayload$metadata$2 extends n implements a {
    final /* synthetic */ TokenPayload this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenPayload$metadata$2(TokenPayload tokenPayload) {
        super(0);
        this.this$0 = tokenPayload;
    }

    @Override // ho.a
    public final String invoke() {
        com.auth0.android.jwt.a aVar = (com.auth0.android.jwt.a) this.this$0.getJwt().f5168c.f5175g.get("metadata");
        if (aVar == null) {
            return null;
        }
        f fVar = aVar.f5165a;
        fVar.getClass();
        if (!(fVar instanceof j)) {
            return null;
        }
        return fVar.j();
    }
}
