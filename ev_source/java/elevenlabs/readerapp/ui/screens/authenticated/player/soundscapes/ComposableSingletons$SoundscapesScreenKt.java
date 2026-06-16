package io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes;

import ho.p;
import ho.q;
import io.elevenlabs.domain.model.Soundscape;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapeCategory;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesContract;
import io.elevenlabs.ui.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import r1.p2;
import sn.z;
import t2.u;
import tn.o;
import tn.y;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$SoundscapesScreenKt {
    public static final ComposableSingletons$SoundscapesScreenKt INSTANCE = new ComposableSingletons$SoundscapesScreenKt();

    /* renamed from: lambda$-315750360 */
    private static p f461lambda$315750360 = new c3.j(new a(8), false, -315750360);

    /* renamed from: lambda$-664115423 */
    private static q f463lambda$664115423 = new c3.j(new b(0), false, -664115423);

    /* renamed from: lambda$-1572457102 */
    private static p f459lambda$1572457102 = new c3.j(new a(9), false, -1572457102);

    /* renamed from: lambda$-1350132463 */
    private static p f458lambda$1350132463 = new c3.j(new a(10), false, -1350132463);

    /* renamed from: lambda$-531919108 */
    private static p f462lambda$531919108 = new c3.j(new a(11), false, -531919108);

    /* renamed from: lambda$-1918080440 */
    private static p f460lambda$1918080440 = new c3.j(new a(12), false, -1918080440);

    public static final z lambda__1350132463$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            no.e eVar = new no.e(0, 20, 1);
            ArrayList arrayList = new ArrayList(tn.p.a0(eVar, 10));
            Iterator it = eVar.iterator();
            while (((no.f) it).f24561c) {
                int nextInt = ((y) it).nextInt();
                list5 = SoundscapesScreenKt.previewSoundscapes;
                arrayList.add(Soundscape.copy$default((Soundscape) list5.get(nextInt % 3), String.valueOf(nextInt), null, null, null, null, null, null, 126, null));
            }
            SoundscapeCategory.Focus focus = SoundscapeCategory.Focus.INSTANCE;
            list = SoundscapesScreenKt.previewSoundscapes;
            Soundscape soundscape = (Soundscape) list.get(2);
            list2 = SoundscapesScreenKt.previewSoundscapes;
            Soundscape soundscape2 = (Soundscape) o.y0(list2);
            list3 = SoundscapesScreenKt.previewSoundscapes;
            String id2 = ((Soundscape) list3.get(2)).getId();
            list4 = SoundscapesScreenKt.previewSoundscapes;
            Map singletonMap = Collections.singletonMap(((Soundscape) list4.get(2)).getId(), Float.valueOf(0.45f));
            singletonMap.getClass();
            SoundscapesContract.State state = new SoundscapesContract.State(false, null, arrayList, null, focus, 0.7f, soundscape, null, soundscape2, null, Float.valueOf(0.6f), id2, singletonMap, 650, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new l(4);
                qVar.h0(L);
            }
            SoundscapesScreenKt.SoundscapesUI(state, (ho.l) L, qVar, 48);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1350132463$lambda$0$1$0(SoundscapesContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z lambda__1572457102$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        List list;
        List<Soundscape> list2;
        List list3;
        List list4;
        List list5;
        List list6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            list = SoundscapesScreenKt.previewSoundscapes;
            SoundscapeCategory.Companion companion = SoundscapeCategory.INSTANCE;
            list2 = SoundscapesScreenKt.previewSoundscapes;
            List<SoundscapeCategory> buildTabs = companion.buildTabs(list2);
            SoundscapeCategory.All all = SoundscapeCategory.All.INSTANCE;
            list3 = SoundscapesScreenKt.previewSoundscapes;
            Soundscape soundscape = (Soundscape) list3.get(1);
            list4 = SoundscapesScreenKt.previewSoundscapes;
            Soundscape soundscape2 = (Soundscape) o.y0(list4);
            list5 = SoundscapesScreenKt.previewSoundscapes;
            String id2 = ((Soundscape) list5.get(1)).getId();
            list6 = SoundscapesScreenKt.previewSoundscapes;
            Map singletonMap = Collections.singletonMap(((Soundscape) list6.get(2)).getId(), Float.valueOf(0.45f));
            singletonMap.getClass();
            SoundscapesContract.State state = new SoundscapesContract.State(false, null, list, buildTabs, all, 0.7f, soundscape, null, soundscape2, null, Float.valueOf(0.6f), id2, singletonMap, 642, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new l(3);
                qVar.h0(L);
            }
            SoundscapesScreenKt.SoundscapesUI(state, (ho.l) L, qVar, 48);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1572457102$lambda$0$0$0(SoundscapesContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z lambda__1918080440$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            SoundscapesContract.State state = new SoundscapesContract.State(false, "Something went wrong", null, null, null, u.P, null, null, null, null, null, null, null, 8188, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new l(2);
                qVar.h0(L);
            }
            SoundscapesScreenKt.SoundscapesUI(state, (ho.l) L, qVar, 48);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1918080440$lambda$0$0$0(SoundscapesContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z lambda__315750360$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            n.c(kd.a.M(R.drawable.soundscape_off, qVar, 0), kj.c.R(qVar, io.elevenlabs.readerapp.R.string.player_soundscapes_turn_off), p2.o(i3.q.f13017a, 48), null, null, u.P, null, qVar, u3.c.$stable | 384, 120);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__531919108$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            SoundscapesContract.State state = new SoundscapesContract.State(true, null, null, null, null, u.P, null, null, null, null, null, null, null, 8190, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new l(1);
                qVar.h0(L);
            }
            SoundscapesScreenKt.SoundscapesUI(state, (ho.l) L, qVar, 48);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__531919108$lambda$0$0$0(SoundscapesContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z lambda__664115423$lambda$0(t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            SoundscapesScreenKt.FeedbackCallout(r1.d.G(i3.q.f13017a, u.P, 24, 1), qVar, 6, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1350132463$app_productionRelease */
    public final p m1535getLambda$1350132463$app_productionRelease() {
        return f458lambda$1350132463;
    }

    /* renamed from: getLambda$-1572457102$app_productionRelease */
    public final p m1536getLambda$1572457102$app_productionRelease() {
        return f459lambda$1572457102;
    }

    /* renamed from: getLambda$-1918080440$app_productionRelease */
    public final p m1537getLambda$1918080440$app_productionRelease() {
        return f460lambda$1918080440;
    }

    /* renamed from: getLambda$-315750360$app_productionRelease */
    public final p m1538getLambda$315750360$app_productionRelease() {
        return f461lambda$315750360;
    }

    /* renamed from: getLambda$-531919108$app_productionRelease */
    public final p m1539getLambda$531919108$app_productionRelease() {
        return f462lambda$531919108;
    }

    /* renamed from: getLambda$-664115423$app_productionRelease */
    public final q m1540getLambda$664115423$app_productionRelease() {
        return f463lambda$664115423;
    }
}
