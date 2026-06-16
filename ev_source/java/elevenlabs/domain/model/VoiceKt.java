package io.elevenlabs.domain.model;

import java.util.Locale;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0007"}, d2 = {"isFavorited", "", "Lio/elevenlabs/domain/model/Voice;", "(Lio/elevenlabs/domain/model/Voice;)Z", "matchesSearchQuery", "query", "", "domain"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class VoiceKt {
    public static final boolean isFavorited(Voice voice) {
        voice.getClass();
        if (voice.getFavoritedAtUnix() != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        if (wq.n.a0(r1, r5, false) == true) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean matchesSearchQuery(Voice voice, String str) {
        voice.getClass();
        str.getClass();
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = voice.getName().toLowerCase(locale);
        lowerCase2.getClass();
        if (!n.a0(lowerCase2, lowerCase, false)) {
            String description = voice.getDescription();
            if (description != null) {
                String lowerCase3 = description.toLowerCase(locale);
                lowerCase3.getClass();
            }
            String subtitle = voice.getSubtitle();
            if (subtitle != null) {
                String lowerCase4 = subtitle.toLowerCase(locale);
                lowerCase4.getClass();
                if (n.a0(lowerCase4, lowerCase, false)) {
                }
            }
            return false;
        }
        return true;
    }
}
