package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections;

import a2.k3;
import a2.t0;
import c3.k;
import h4.f;
import h4.f2;
import h4.g;
import ho.l;
import i3.t;
import io.elevenlabs.domain.model.ExploreVoiceSections;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicePickerVoiceRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.extensions.PageSizeWithRatio;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.v;
import livekit.LivekitInternal$NodeStats;
import r1.x;
import sn.z;
import t1.i;
import t2.u;
import tn.o;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import w1.h;
import w1.h0;
import w1.j;
import w1.w;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\r\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lt1/t;", "", "sectionKey", "Lio/elevenlabs/domain/model/ExploreVoiceSections$Section$VoiceGrid;", "section", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "sharedState", "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "Lsn/z;", "onSharedEvent", "voicePickerExploreGridSection", "(Lt1/t;Ljava/lang/String;Lio/elevenlabs/domain/model/ExploreVoiceSections$Section$VoiceGrid;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;Lho/l;)V", "HorizontalVoicesList", "(Lio/elevenlabs/domain/model/ExploreVoiceSections$Section$VoiceGrid;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;Lho/l;Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerExploreGridSectionKt {
    private static final void HorizontalVoicesList(ExploreVoiceSections.Section.VoiceGrid voiceGrid, VoicePickerSharedContract.State state, l lVar, m mVar, int i10) {
        ExploreVoiceSections.Section.VoiceGrid voiceGrid2;
        int i11;
        boolean z6;
        q qVar;
        int i12;
        int i13;
        int i14;
        q qVar2 = (q) mVar;
        qVar2.Z(-212523045);
        if ((i10 & 6) == 0) {
            voiceGrid2 = voiceGrid;
            if (qVar2.h(voiceGrid2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            voiceGrid2 = voiceGrid;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(state)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(lVar)) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            ArrayList l02 = o.l0(voiceGrid2.getVoices(), 2);
            float m1979rememberDpToPx8Feqmps = ComposeExtensionsKt.m1979rememberDpToPx8Feqmps(500, qVar2, 6);
            boolean c5 = qVar2.c(m1979rememberDpToPx8Feqmps);
            Object L = qVar2.L();
            if (c5 || L == u2.l.f33918a) {
                L = new PageSizeWithRatio(0.9f, Integer.valueOf((int) m1979rememberDpToPx8Feqmps));
                qVar2.h0(L);
            }
            j jVar = (PageSizeWithRatio) L;
            w1.c b10 = h0.b(0, new v(l02) { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerExploreGridSectionKt$HorizontalVoicesList$1
                @Override // oo.r
                public Object get() {
                    return Integer.valueOf(((List) this.receiver).size());
                }
            }, qVar2, 0, 3);
            if (l02.size() <= 1) {
                jVar = h.f35997a;
            }
            qVar = qVar2;
            gg.b.d(b10, null, null, jVar, 0, u.P, i3.d.f13004y0, null, false, null, null, null, k.d(-808083462, true, new io.elevenlabs.readerapp.core.h(l02, state, lVar, 12), qVar2), qVar, 1572864, 24576, 16310);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 21, voiceGrid, state, lVar);
        }
    }

    public static final z HorizontalVoicesList$lambda$1(List list, VoicePickerSharedContract.State state, l lVar, w wVar, int i10, m mVar, int i11) {
        wVar.getClass();
        x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, mVar, 0);
        q qVar = (q) mVar;
        int hashCode = Long.hashCode(qVar.T);
        c3.o l4 = qVar.l();
        t c5 = i3.a.c(i3.q.f13017a, mVar);
        h4.h.f11920i.getClass();
        f fVar = g.f11903b;
        f2 f2Var = qVar.f33969a;
        qVar.b0();
        if (qVar.S) {
            qVar.k(fVar);
        } else {
            qVar.k0();
        }
        r.J(g.f11907f, a10, mVar);
        r.J(g.f11906e, l4, mVar);
        r.y(mVar, Integer.valueOf(hashCode), g.f11908g);
        r.F(g.f11909h, mVar);
        r.J(g.f11905d, c5, mVar);
        List list2 = (List) list.get(i10);
        qVar.X(-1373166940);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            VoicePickerVoiceRowKt.VoicePickerVoiceRow((Voice) it.next(), state, lVar, false, false, mVar, 0, 24);
        }
        qVar.p(false);
        qVar.p(true);
        return z.f31622a;
    }

    public static final z HorizontalVoicesList$lambda$2(ExploreVoiceSections.Section.VoiceGrid voiceGrid, VoicePickerSharedContract.State state, l lVar, int i10, m mVar, int i11) {
        HorizontalVoicesList(voiceGrid, state, lVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void voicePickerExploreGridSection(t1.t tVar, String str, ExploreVoiceSections.Section.VoiceGrid voiceGrid, VoicePickerSharedContract.State state, l lVar) {
        tVar.getClass();
        str.getClass();
        voiceGrid.getClass();
        state.getClass();
        lVar.getClass();
        VoicePickerExploreSectionTitleKt.voicePickerExploreSectionTitle(tVar, str, new t0(voiceGrid, 14));
        ((i) tVar).t(str.concat("_voice_picker_view_type_voices_horizontal_list"), VoicePickerContract.ViewType.VOICES_HORIZONTAL_LIST, new c3.j(new fm.o(voiceGrid, state, lVar, 20), true, 1230000812));
    }

    public static final String voicePickerExploreGridSection$lambda$0(ExploreVoiceSections.Section.VoiceGrid voiceGrid, m mVar, int i10) {
        q qVar = (q) mVar;
        qVar.X(654735468);
        String title = voiceGrid.getTitle();
        qVar.p(false);
        return title;
    }

    public static final z voicePickerExploreGridSection$lambda$1(ExploreVoiceSections.Section.VoiceGrid voiceGrid, VoicePickerSharedContract.State state, l lVar, t1.b bVar, m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HorizontalVoicesList(voiceGrid, state, lVar, qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }
}
