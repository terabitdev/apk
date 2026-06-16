package io.elevenlabs.data.extensions;

import android.gov.nist.core.Separators;
import defpackage.f;
import java.net.URI;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.k;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a=\u0010\u0005\u001a\u00020\u0003*\u00020\u00002*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001\"\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljava/net/URI;", "", "Lsn/k;", "", "parameters", "appendParameters", "(Ljava/net/URI;[Lsn/k;)Ljava/lang/String;", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class URIExtensionsKt {
    public static final String appendParameters(URI uri, k... kVarArr) {
        uri.getClass();
        kVarArr.getClass();
        String query = uri.getQuery();
        StringBuilder sb = new StringBuilder();
        if (query != null) {
            sb.append(query);
        }
        for (k kVar : kVarArr) {
            String j4 = f.j((String) kVar.f31600a, Separators.EQUALS, (String) kVar.f31601b);
            if (sb.toString().length() > 0) {
                sb.append(Separators.AND);
            }
            sb.append(j4);
        }
        String uri2 = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), sb.toString(), uri.getFragment()).toString();
        uri2.getClass();
        return uri2;
    }
}
