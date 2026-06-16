package io.elevenlabs.readerapp.ui.previews;

import ae.l;
import com.google.android.gms.internal.play_billing.b;
import defpackage.f;
import io.elevenlabs.domain.model.Bookmark;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import no.g;
import tn.o;
import tn.p;
import tn.y;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"stubBookmarksList", "", "Lio/elevenlabs/domain/model/Bookmark;", "count", "", "stubBookmark", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BookmarksFactoryKt {
    public static final Bookmark stubBookmark() {
        return (Bookmark) o.w0(stubBookmarksList(1));
    }

    public static final List<Bookmark> stubBookmarksList(int i10) {
        String str;
        g f02 = l.f0(0, i10);
        ArrayList arrayList = new ArrayList(p.a0(f02, 10));
        Iterator it = f02.iterator();
        while (it.hasNext()) {
            int nextInt = ((y) it).nextInt();
            String e10 = f.e(nextInt, "bookmark-");
            String e11 = f.e(nextInt, "read-");
            long j4 = nextInt * 100;
            long j10 = (nextInt + 1) * 100;
            String j11 = b.j(nextInt, "This is bookmark number ", " with some additional text to make it longer and more realistic");
            if (nextInt % 2 == 0) {
                str = f.e(nextInt, "This is a note for bookmark ");
            } else {
                str = null;
            }
            arrayList.add(new Bookmark(e10, e11, j4, j10, j11, new Date(1714026044L), new Date(1714026044L), str, null, null, null, 1792, null));
        }
        return arrayList;
    }

    public static /* synthetic */ List stubBookmarksList$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return stubBookmarksList(i10);
    }
}
