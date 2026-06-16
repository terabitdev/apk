package io.livekit.android.room.participant;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"mimeTypeToVideoCodec", "", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PublishUtilsKt {
    public static final String mimeTypeToVideoCodec(String str) {
        String str2;
        str.getClass();
        List z02 = n.z0(str, new String[]{Separators.SLASH}, 6);
        if (str.length() <= 1) {
            z02 = null;
        }
        if (z02 == null || (str2 = (String) z02.get(1)) == null) {
            return null;
        }
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }
}
