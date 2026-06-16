package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.formatter.MinutesFormatterKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SleepTimerOption;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.j1;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.y2;
import r1.c3;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.o1;
import r1.p2;
import r1.u0;
import s4.y0;
import u2.r1;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aI\u0010\r\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002 \b\u0002\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onClose", "", "readId", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/SleepTimerViewModel;", "vm", "SleepTimerSheet", "(Lho/a;Ljava/lang/String;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/SleepTimerViewModel;Lu2/m;II)V", "Lkotlin/Function1;", "action", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/SleepTimerState;", RemoteConfigConstants.ResponseFieldKey.STATE, "SleepTimerSheetUI", "(Lho/a;Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/SleepTimerState;Lu2/m;II)V", "Preview_SleepTimerSheet", "(Lu2/m;I)V", "", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/SleepTimerOption;", "defaultOptions", "Ljava/util/List;", "", "alpha", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SleepTimerSheetKt {
    private static final List<SleepTimerOption> defaultOptions = tn.n.F0(new SleepTimerOption[]{new SleepTimerOption.Time(60), new SleepTimerOption.Time(45), new SleepTimerOption.Time(30), new SleepTimerOption.Time(15), new SleepTimerOption.Time(10), new SleepTimerOption.Time(5), SleepTimerOption.Off.INSTANCE});

    public static final void Preview_SleepTimerSheet(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1577123642);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            SleepTimerSheetUI(null, null, new SleepTimerState(null, null, null, null, 15, null), qVar, 0, 3);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 21);
        }
    }

    public static final sn.z Preview_SleepTimerSheet$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_SleepTimerSheet(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        if ((r22 & 4) != 0) goto L118;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SleepTimerSheet(ho.a aVar, String str, SleepTimerViewModel sleepTimerViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        SleepTimerViewModel sleepTimerViewModel2;
        boolean z6;
        SleepTimerViewModel sleepTimerViewModel3;
        q7.c cVar;
        boolean z10;
        int i13;
        int i14;
        int i15;
        aVar.getClass();
        str.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(202984018);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(str)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                sleepTimerViewModel2 = sleepTimerViewModel;
                if (qVar.h(sleepTimerViewModel2)) {
                    i13 = RpcError.MAX_MESSAGE_BYTES;
                    i12 |= i13;
                }
            } else {
                sleepTimerViewModel2 = sleepTimerViewModel;
            }
            i13 = 128;
            i12 |= i13;
        } else {
            sleepTimerViewModel2 = sleepTimerViewModel;
        }
        boolean z11 = false;
        if ((i12 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
            } else {
                if ((i11 & 4) != 0) {
                    androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar);
                        if (a10 instanceof androidx.lifecycle.o) {
                            cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        sleepTimerViewModel2 = (SleepTimerViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(SleepTimerViewModel.class), a10, null, o6, cVar, qVar);
                        i12 &= -897;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                SleepTimerViewModel sleepTimerViewModel4 = sleepTimerViewModel2;
                int i16 = i12;
                qVar.q();
                boolean h10 = qVar.h(sleepTimerViewModel4);
                if ((i16 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z12 = h10 | z10;
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (z12 || L == eVar) {
                    L = new SleepTimerSheetKt$SleepTimerSheet$1$1(sleepTimerViewModel4, str, null);
                    qVar.h0(L);
                }
                u2.r.f((ho.p) L, str, qVar);
                boolean h11 = qVar.h(sleepTimerViewModel4);
                if ((i16 & 14) == 4) {
                    z11 = true;
                }
                boolean z13 = h11 | z11;
                Object L2 = qVar.L();
                if (z13 || L2 == eVar) {
                    L2 = new a2.q(sleepTimerViewModel4, aVar, 28);
                    qVar.h0(L2);
                }
                BottomSheetScaffoldKt.m1898BottomSheetScaffoldjb40ds(false, false, 0L, t2.u.P, (ho.a) L2, kj.c.R(qVar, R.string.player_sleep_timer_title), (ho.r) c3.k.d(518528352, true, new m(sleepTimerViewModel4, 1), qVar), (u2.m) qVar, 1572864, 15);
                qVar = qVar;
                sleepTimerViewModel3 = sleepTimerViewModel4;
            }
        } else {
            qVar.R();
            sleepTimerViewModel3 = sleepTimerViewModel2;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(aVar, (Object) str, (Object) sleepTimerViewModel3, i10, i11, 5);
        }
    }

    public static final sn.z SleepTimerSheet$lambda$1$0(SleepTimerViewModel sleepTimerViewModel, ho.a aVar) {
        sleepTimerViewModel.reset();
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z SleepTimerSheet$lambda$2(SleepTimerViewModel sleepTimerViewModel, r1.y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        SleepTimerState sleepTimerState = (SleepTimerState) u2.r.o(sleepTimerViewModel.getStateFlow(), mVar, 0).getValue();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(bottomSheetControl);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new b(bottomSheetControl, 5);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        boolean h11 = qVar.h(sleepTimerViewModel);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new v(sleepTimerViewModel, 0);
            qVar.h0(L2);
        }
        SleepTimerSheetUI(aVar, (ho.l) L2, sleepTimerState, qVar, 0, 0);
        return sn.z.f31622a;
    }

    public static final sn.z SleepTimerSheet$lambda$2$0$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return sn.z.f31622a;
    }

    public static final sn.z SleepTimerSheet$lambda$2$1$0(SleepTimerViewModel sleepTimerViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(sleepTimerViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z SleepTimerSheet$lambda$3(ho.a aVar, String str, SleepTimerViewModel sleepTimerViewModel, int i10, int i11, u2.m mVar, int i12) {
        SleepTimerSheet(aVar, str, sleepTimerViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SleepTimerSheetUI(ho.a aVar, ho.l lVar, SleepTimerState sleepTimerState, u2.m mVar, int i10, int i11) {
        ho.a aVar2;
        int i12;
        int i13;
        ho.l lVar2;
        int i14;
        boolean z6;
        ho.a aVar3;
        ho.l lVar3;
        r1 r10;
        ho.a aVar4;
        ho.l lVar4;
        boolean z10;
        boolean z11;
        boolean z12;
        String formatMinutesLong;
        boolean z13;
        int i15;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(256293033);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            aVar2 = aVar;
        } else if ((i10 & 6) == 0) {
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            aVar2 = aVar;
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            lVar2 = lVar;
            if (qVar.h(lVar2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            if ((i10 & 384) == 0) {
                if (qVar.h(sleepTimerState)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
            }
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                u2.e eVar = u2.l.f33918a;
                if (i16 != 0) {
                    Object L = qVar.L();
                    if (L == eVar) {
                        L = new c(5);
                        qVar.h0(L);
                    }
                    aVar4 = (ho.a) L;
                } else {
                    aVar4 = aVar2;
                }
                if (i17 != 0) {
                    Object L2 = qVar.L();
                    if (L2 == eVar) {
                        L2 = new o(19);
                        qVar.h0(L2);
                    }
                    lVar4 = (ho.l) L2;
                } else {
                    lVar4 = lVar2;
                }
                i3.q qVar2 = i3.q.f13017a;
                i3.t e10 = p2.e(qVar2, 1.0f);
                r1.e eVar2 = r1.j.f29230c;
                i3.j jVar = i3.d.B0;
                r1.x a10 = r1.w.a(eVar2, jVar, qVar, 0);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c5 = i3.a.c(e10, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                h4.e eVar3 = h4.g.f11907f;
                u2.r.J(eVar3, a10, qVar);
                h4.e eVar4 = h4.g.f11906e;
                u2.r.J(eVar4, l4, qVar);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar5 = h4.g.f11908g;
                u2.r.y(qVar, valueOf, eVar5);
                h4.d dVar = h4.g.f11909h;
                u2.r.F(dVar, qVar);
                h4.e eVar6 = h4.g.f11905d;
                u2.r.J(eVar6, c5, qVar);
                int i18 = i12;
                i3.t e11 = p2.e(qVar2, 1.0f);
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                i3.t y10 = l1.n.y(e11.then(new m1(1.0f, true)), l1.n.x(qVar), true, true);
                r1.x a11 = r1.w.a(eVar2, jVar, qVar, 0);
                int hashCode2 = Long.hashCode(qVar.T);
                c3.o l7 = qVar.l();
                i3.t c10 = i3.a.c(y10, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                u2.r.J(eVar3, a11, qVar);
                u2.r.J(eVar4, l7, qVar);
                defpackage.f.u(hashCode2, qVar, eVar5, qVar, dVar);
                u2.r.J(eVar6, c10, qVar);
                qVar.X(1787849398);
                Iterator it = sleepTimerState.getOptions().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i20 = i19 + 1;
                    if (i19 >= 0) {
                        SleepTimerOption sleepTimerOption = (SleepTimerOption) next;
                        if (kotlin.jvm.internal.m.c(sleepTimerOption, SleepTimerOption.Off.INSTANCE)) {
                            qVar.X(1919083199);
                            formatMinutesLong = kj.c.R(qVar, R.string.player_sleep_timer_option_off);
                            z12 = false;
                            qVar.p(false);
                        } else {
                            z12 = false;
                            if (sleepTimerOption instanceof SleepTimerOption.Time) {
                                qVar.X(1919087100);
                                formatMinutesLong = MinutesFormatterKt.formatMinutesLong(((SleepTimerOption.Time) sleepTimerOption).getTimerMinutes(), qVar, 0);
                                qVar.p(false);
                            } else {
                                throw com.google.android.gms.internal.play_billing.b.h(1919081445, qVar, false);
                            }
                        }
                        if ((i18 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        boolean h10 = z13 | qVar.h(sleepTimerOption);
                        Object L3 = qVar.L();
                        if (h10 || L3 == eVar) {
                            L3 = new a2.q(lVar4, sleepTimerOption, 29);
                            qVar.h0(L3);
                        }
                        i3.q qVar3 = qVar2;
                        u2.e eVar7 = eVar;
                        ho.l lVar5 = lVar4;
                        Iterator it2 = it;
                        u2.q qVar4 = qVar;
                        ButtonContainerKt.m1780ButtonContainer83mGB3Q(formatMinutesLong, (ho.a) L3, null, 0L, false, 0, null, false, null, c3.k.d(339409005, true, new fm.o(formatMinutesLong, (Object) sleepTimerState, (Object) sleepTimerOption, 16), qVar), qVar4, 805306368, 508);
                        qVar = qVar4;
                        if (i19 != ig.f.y(sleepTimerState.getOptions())) {
                            qVar.X(-636465053);
                            DividerKt.m1827DivideriJQMabo(r1.d.G(qVar3, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2357getX5D9Ej5fM(), t2.u.P, 2), 0L, qVar, 0, 2);
                            qVar.p(false);
                        } else {
                            qVar.X(-636351655);
                            qVar.p(false);
                        }
                        it = it2;
                        qVar2 = qVar3;
                        lVar4 = lVar5;
                        i19 = i20;
                        eVar = eVar7;
                    } else {
                        ig.f.U();
                        throw null;
                    }
                }
                ho.l lVar6 = lVar4;
                i3.q qVar5 = qVar2;
                u2.e eVar8 = eVar;
                boolean z14 = false;
                qVar.p(false);
                qVar.p(true);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i21 = ElevenLabsTheme.$stable;
                ib.i.A(elevenLabsTheme, qVar, i21, qVar5, qVar);
                String R = kj.c.R(qVar, R.string.player_sleep_timer_save);
                ButtonSize buttonSize = ButtonSize.Medium;
                i3.t f10 = ib.i.f(elevenLabsTheme, qVar, i21, p2.e(qVar5, 1.0f));
                if (sleepTimerState.getSelected() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i18 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i18 & 14) == 4) {
                    z14 = true;
                }
                boolean z15 = z14 | z11;
                Object L4 = qVar.L();
                if (z15 || L4 == eVar8) {
                    L4 = new t(lVar6, aVar4);
                    qVar.h0(L4);
                }
                ButtonKt.Button(R, (ho.a) L4, f10, buttonSize, null, null, null, false, z10, false, qVar, 3072, 752);
                WeakHashMap weakHashMap = c3.f29142x;
                r1.d.g(r1.d.P(qVar5, new o1(u0.e(qVar).f29154l, 32)), qVar);
                qVar.p(true);
                aVar3 = aVar4;
                lVar3 = lVar6;
            } else {
                qVar.R();
                aVar3 = aVar2;
                lVar3 = lVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(aVar3, (Object) lVar3, (Object) sleepTimerState, i10, i11, 6);
                return;
            }
            return;
        }
        lVar2 = lVar;
        if ((i10 & 384) == 0) {
        }
        if ((i12 & 147) == 146) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z SleepTimerSheetUI$lambda$1$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z SleepTimerSheetUI$lambda$2$0$0$0$0(ho.l lVar, SleepTimerOption sleepTimerOption) {
        lVar.invoke(new u(sleepTimerOption, 0));
        return sn.z.f31622a;
    }

    public static final sn.z SleepTimerSheetUI$lambda$2$0$0$0$0$0(SleepTimerOption sleepTimerOption, SleepTimerViewModel sleepTimerViewModel) {
        sleepTimerViewModel.getClass();
        sleepTimerViewModel.onOptionSelect(sleepTimerOption);
        return sn.z.f31622a;
    }

    public static final sn.z SleepTimerSheetUI$lambda$2$0$0$1(String str, SleepTimerState sleepTimerState, SleepTimerOption sleepTimerOption, r1.s sVar, u2.m mVar, int i10) {
        boolean z6;
        float f10;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            i3.t f11 = ib.i.f(elevenLabsTheme, qVar, i11, e10);
            k2 a10 = i2.a(r1.j.f29228a, i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(f11, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            y0 bodyMedium700 = elevenLabsTheme.getTypo(qVar, i11).getBodyMedium700();
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            j7.d(str, new m1(1.0f, true), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bodyMedium700, qVar, 0, 0, 131068);
            r1.d.g(p2.s(qVar2, elevenLabsTheme.getSpacings(qVar, i11).m2353getX2D9Ej5fM()), qVar);
            if (kotlin.jvm.internal.m.c(sleepTimerState.getSelected(), sleepTimerOption)) {
                f10 = 1.0f;
            } else {
                f10 = t2.u.P;
            }
            y2.a(kd.a.M(io.elevenlabs.ui.R.drawable.check_1, qVar, 0), null, m3.h.a(p2.o(qVar2, 24), SleepTimerSheetUI$lambda$2$0$0$1$0$0(j1.f.b(f10, null, "alpha", qVar, 3072, 22))), 0L, qVar, u3.c.$stable | 48, 8);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    private static final float SleepTimerSheetUI$lambda$2$0$0$1$0$0(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final sn.z SleepTimerSheetUI$lambda$2$1$0(ho.l lVar, ho.a aVar) {
        lVar.invoke(new o(18));
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z SleepTimerSheetUI$lambda$2$1$0$0(SleepTimerViewModel sleepTimerViewModel) {
        sleepTimerViewModel.getClass();
        sleepTimerViewModel.save();
        return sn.z.f31622a;
    }

    public static final sn.z SleepTimerSheetUI$lambda$3(ho.a aVar, ho.l lVar, SleepTimerState sleepTimerState, int i10, int i11, u2.m mVar, int i12) {
        SleepTimerSheetUI(aVar, lVar, sleepTimerState, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
