package io.elevenlabs.readerapp.usecase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import org.jsoup.nodes.g;
import org.jsoup.nodes.k;
import rd.s0;
import wq.u;
import xs.e;
import xs.v;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002¨\u0006\t"}, d2 = {"Lio/elevenlabs/readerapp/usecase/GetCharacterOffsetsFromHtmlRowUseCase;", "", "<init>", "()V", "invoke", "", "Lio/elevenlabs/readerapp/usecase/CharacterOffset;", "html", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class GetCharacterOffsetsFromHtmlRowUseCase {
    public static final int $stable = 0;

    public final List<CharacterOffset> invoke(String html) {
        CharacterOffset characterOffset;
        html.getClass();
        g B = s0.B(html);
        us.g.z("span[c]");
        e e10 = jo.a.e(v.g0("span[c]"), B);
        e10.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = e10.iterator();
        while (it.hasNext()) {
            String d10 = ((k) it.next()).d("c");
            d10.getClass();
            Long Z = u.Z(d10);
            if (Z != null) {
                long longValue = Z.longValue();
                characterOffset = new CharacterOffset(longValue, r1.a0().length() + longValue);
            } else {
                characterOffset = null;
            }
            if (characterOffset != null) {
                arrayList.add(characterOffset);
            }
        }
        return arrayList;
    }
}
