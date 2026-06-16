package io.elevenlabs.player;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.net.Uri;
import android.os.Bundle;
import fr.n;
import ho.l;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.domain.model.ReadSource;
import ja.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import lh.b0;
import lh.t;
import livekit.LivekitInternal$NodeStats;
import no.g;
import tn.p;
import tn.y;
import w7.r0;
import w7.u0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0082@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {TokenNames.T, "Llh/b0;", "await", "(Llh/b0;Lwn/c;)Ljava/lang/Object;", "Lja/z;", "", "mediaId", "", "indexOfMediaId", "(Lja/z;Ljava/lang/String;)Ljava/lang/Integer;", "Lw7/r0;", "findExistingItem", "(Lja/z;Ljava/lang/String;)Lw7/r0;", "Lio/elevenlabs/domain/model/MediaQueueState;", "getPlaylistState", "(Lja/z;)Lio/elevenlabs/domain/model/MediaQueueState;", "Lio/elevenlabs/domain/model/MediaItemState;", "toMediaItemState", "(Lw7/r0;)Lio/elevenlabs/domain/model/MediaItemState;", "player_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BackgroundPlayerControllerServiceKt {
    public static final /* synthetic */ r0 access$findExistingItem(z zVar, String str) {
        return findExistingItem(zVar, str);
    }

    public static final /* synthetic */ Integer access$indexOfMediaId(z zVar, String str) {
        return indexOfMediaId(zVar, str);
    }

    public static final <T> Object await(final b0 b0Var, wn.c<? super T> cVar) {
        final n nVar = new n(1, gg.b.V(cVar));
        nVar.t();
        nVar.e(new l() { // from class: io.elevenlabs.player.BackgroundPlayerControllerServiceKt$await$2$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return sn.z.f31622a;
            }

            public final void invoke(Throwable th) {
                b0.this.cancel(true);
            }
        });
        b0Var.a(new Runnable() { // from class: io.elevenlabs.player.BackgroundPlayerControllerServiceKt$await$2$2
            @Override // java.lang.Runnable
            public final void run() {
                fr.l.this.resumeWith(b0Var.get(10L, TimeUnit.SECONDS));
            }
        }, t.f21844a);
        return nVar.s();
    }

    public static final r0 findExistingItem(z zVar, String str) {
        int mediaItemCount = zVar.getMediaItemCount();
        for (int i10 = 0; i10 < mediaItemCount; i10++) {
            r0 mediaItemAt = zVar.getMediaItemAt(i10);
            mediaItemAt.getClass();
            if (m.c(mediaItemAt.f36578a, str)) {
                return mediaItemAt;
            }
        }
        return null;
    }

    public static final MediaQueueState getPlaylistState(z zVar) {
        g f02 = ae.l.f0(0, zVar.getMediaItemCount());
        ArrayList arrayList = new ArrayList(p.a0(f02, 10));
        Iterator it = f02.iterator();
        while (it.hasNext()) {
            r0 mediaItemAt = zVar.getMediaItemAt(((y) it).nextInt());
            mediaItemAt.getClass();
            arrayList.add(toMediaItemState(mediaItemAt));
        }
        return new MediaQueueState(arrayList, zVar.getCurrentMediaItemIndex());
    }

    public static final Integer indexOfMediaId(z zVar, String str) {
        int mediaItemCount = zVar.getMediaItemCount();
        for (int i10 = 0; i10 < mediaItemCount; i10++) {
            if (m.c(zVar.getMediaItemAt(i10).f36578a, str)) {
                return Integer.valueOf(i10);
            }
        }
        return null;
    }

    public static final MediaItemState toMediaItemState(r0 r0Var) {
        String str;
        String str2;
        String str3;
        ReadSource readSource;
        String str4 = r0Var.f36578a;
        str4.getClass();
        u0 u0Var = r0Var.f36581d;
        CharSequence charSequence = u0Var.f36648a;
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = "Unknown";
        }
        CharSequence charSequence2 = u0Var.f36649b;
        if (charSequence2 == null || (str2 = charSequence2.toString()) == null) {
            str2 = "ElevenLabs";
        }
        Uri uri = u0Var.f36661n;
        String str5 = null;
        if (uri != null) {
            str3 = uri.toString();
        } else {
            str3 = null;
        }
        Bundle bundle = u0Var.J;
        if (bundle != null) {
            readSource = ExchangeKt.getReadSource(bundle);
        } else {
            readSource = null;
        }
        Bundle bundle2 = u0Var.J;
        if (bundle2 != null) {
            str5 = ExchangeKt.getOriginalFileType(bundle2);
        }
        return new MediaItemState(str4, str, str2, str3, readSource, str5);
    }
}
