package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import f4.f1;
import i3.t;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerContract;
import io.elevenlabs.ui.components.ChipGroupKt;
import io.elevenlabs.ui.echo.EchoTheme;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.d2;
import r1.p;
import r1.p2;
import sn.z;
import t2.u;
import tn.o;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$TabsState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerTab;", "Lsn/z;", "selectTab", "VoicePickerTabs", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$TabsState;Lho/l;Lu2/m;I)V", "Preview_VoicePickerTabs", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerTabsKt {
    public static final void Preview_VoicePickerTabs(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-495843463);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            VoicePickerContract.TabsState.Visible visible = new VoicePickerContract.TabsState.Visible(VoicePickerTab.Recents, o.g1(VoicePickerTab.getEntries()));
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new n(23);
                qVar.h0(L);
            }
            VoicePickerTabs(visible, (ho.l) L, qVar, 48);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 19);
        }
    }

    public static final z Preview_VoicePickerTabs$lambda$0$0(VoicePickerTab voicePickerTab) {
        voicePickerTab.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePickerTabs$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_VoicePickerTabs(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void VoicePickerTabs(VoicePickerContract.TabsState tabsState, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        int i12;
        boolean h10;
        int i13;
        tabsState.getClass();
        lVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(449333938);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                h10 = qVar.f(tabsState);
            } else {
                h10 = qVar.h(tabsState);
            }
            if (h10) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            if (tabsState instanceof VoicePickerContract.TabsState.Hidden) {
                qVar.X(-1305577714);
                qVar.p(false);
            } else if (tabsState instanceof VoicePickerContract.TabsState.Visible) {
                qVar.X(-1305519186);
                t v9 = p2.v(p2.e(i3.q.f13017a, 1.0f), null, 3);
                f1 d10 = p.d(i3.d.f12997a, false);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                t c5 = i3.a.c(v9, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(h4.g.f11907f, d10, qVar);
                r.J(h4.g.f11906e, l4, qVar);
                r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                r.F(h4.g.f11909h, qVar);
                r.J(h4.g.f11905d, c5, qVar);
                VoicePickerContract.TabsState.Visible visible = (VoicePickerContract.TabsState.Visible) tabsState;
                List<VoicePickerTab> tabs = visible.getTabs();
                VoicePickerTab activeTab = visible.getActiveTab();
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i14 = EchoTheme.$stable;
                d2 f10 = r1.d.f(echoTheme.getSpacings(qVar, i14).getX5(), u.P, echoTheme.getSpacings(qVar, i14).getX5(), echoTheme.getSpacings(qVar, i14).getX2(), 2);
                if ((i11 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object L = qVar.L();
                if (z10 || L == u2.l.f33918a) {
                    L = new g3.m(lVar, 7);
                    qVar.h0(L);
                }
                ChipGroupKt.ChipGroup(null, (ho.l) L, new b(11), tabs, activeTab, new b(12), f10, qVar, 0, 1);
                qVar.p(true);
                qVar.p(false);
            } else {
                throw com.google.android.gms.internal.play_billing.b.h(-1981778708, qVar, false);
            }
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a2.i(tabsState, lVar, i10, 17);
        }
    }

    public static final z VoicePickerTabs$lambda$0$0$0(ho.l lVar, VoicePickerTab voicePickerTab) {
        voicePickerTab.getClass();
        lVar.invoke(voicePickerTab);
        return z.f31622a;
    }

    public static final String VoicePickerTabs$lambda$0$1(VoicePickerTab voicePickerTab, u2.m mVar, int i10) {
        voicePickerTab.getClass();
        q qVar = (q) mVar;
        qVar.X(755403847);
        String R = kj.c.R(qVar, voicePickerTab.getTitle());
        qVar.p(false);
        return R;
    }

    public static final Integer VoicePickerTabs$lambda$0$2(VoicePickerTab voicePickerTab, u2.m mVar, int i10) {
        voicePickerTab.getClass();
        q qVar = (q) mVar;
        qVar.X(1764192024);
        int icon = voicePickerTab.getIcon();
        qVar.p(false);
        return Integer.valueOf(icon);
    }

    public static final z VoicePickerTabs$lambda$1(VoicePickerContract.TabsState tabsState, ho.l lVar, int i10, u2.m mVar, int i11) {
        VoicePickerTabs(tabsState, lVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
