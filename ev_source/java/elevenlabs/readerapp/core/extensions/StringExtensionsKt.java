package io.elevenlabs.readerapp.core.extensions;

import android.gov.nist.core.Separators;
import android.util.Patterns;
import android.webkit.URLUtil;
import io.elevenlabs.highlighter.z;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.o;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0002¨\u0006\u0004"}, d2 = {"toUrl", "Ljava/net/URL;", "", "capitalizeWords", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class StringExtensionsKt {
    public static final String capitalizeWords(String str) {
        str.getClass();
        return o.E0(n.z0(str, new String[]{Separators.SP}, 6), Separators.SP, null, null, new z(13), 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence capitalizeWords$lambda$0(String str) {
        str.getClass();
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String valueOf = String.valueOf(str.charAt(0));
            valueOf.getClass();
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            sb.append((Object) upperCase);
            sb.append(str.substring(1));
            return sb.toString();
        }
        return str;
    }

    public static final URL toUrl(String str) {
        str.getClass();
        if (!URLUtil.isValidUrl(str) || !Patterns.WEB_URL.matcher(str).matches()) {
            return null;
        }
        try {
            return new URL(str);
        } catch (MalformedURLException unused) {
            return null;
        }
    }
}
