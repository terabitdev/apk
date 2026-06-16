package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.formatter.NumberFormatterKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.j1;
import io.elevenlabs.ui.components.AutoScalingTextKt;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.SliderKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import ja.c1;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.i2;
import r1.k2;
import r1.p2;
import s4.u0;
import s4.y0;
import u2.e1;
import u2.r1;
import u2.w0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a7\u0010\u0006\u001a\u00020\u00022\u001e\u0010\u0003\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001ak\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\u0003\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0014¨\u0006\u0017²\u0006\u000e\u0010\u0016\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerViewModel;", "Lsn/z;", "action", "", "playbackSpeed", "SpeedPickerSheet", "(Lho/l;FLu2/m;I)V", "min", "max", "", "anchors", "Lkotlin/Function0;", "onClose", "SpeedPickerSheetUI", "(FLho/l;FFLjava/util/List;Lho/a;Lu2/m;II)V", "value", "ValueLabel", "(FFFLu2/m;I)V", "Preview_SpeedPickerSheet", "(Lu2/m;I)V", "Preview_SpeedPickerSheet_Changed", "speed", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SpeedPickerSheetKt {
    public static final void Preview_SpeedPickerSheet(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2077277916);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new o(23);
                qVar.h0(L);
            }
            SpeedPickerSheetUI(1.0f, (ho.l) L, t2.u.P, t2.u.P, null, null, qVar, 54, 60);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 24);
        }
    }

    public static final sn.z Preview_SpeedPickerSheet$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_SpeedPickerSheet$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_SpeedPickerSheet(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_SpeedPickerSheet_Changed(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2011361969);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new o(21);
                qVar.h0(L);
            }
            SpeedPickerSheetUI(0.7556f, (ho.l) L, t2.u.P, t2.u.P, null, null, qVar, 54, 60);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 23);
        }
    }

    public static final sn.z Preview_SpeedPickerSheet_Changed$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_SpeedPickerSheet_Changed$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_SpeedPickerSheet_Changed(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void SpeedPickerSheet(final ho.l lVar, final float f10, u2.m mVar, final int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(656793500);
        if ((i10 & 6) == 0) {
            if (qVar.h(lVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.c(f10)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        boolean z10 = false;
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            if ((i11 & 14) == 4) {
                z10 = true;
            }
            Object L = qVar.L();
            if (z10 || L == u2.l.f33918a) {
                L = new p(lVar, 2);
                qVar.h0(L);
            }
            BottomSheetScaffoldKt.m1898BottomSheetScaffoldjb40ds(false, false, 0L, t2.u.P, (ho.a) L, kj.c.Q(R.string.player_reading_speed, new Object[]{defpackage.f.B(NumberFormatterKt.formatFloat(f10, qVar, (i11 >> 3) & 14), "x")}, qVar), (ho.r) c3.k.d(982661966, true, new io.elevenlabs.highlighter.v(f10, lVar, 1), qVar), (u2.m) qVar, 1572864, 15);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.e0
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z SpeedPickerSheet$lambda$2;
                    int intValue = ((Integer) obj2).intValue();
                    SpeedPickerSheet$lambda$2 = SpeedPickerSheetKt.SpeedPickerSheet$lambda$2(ho.l.this, f10, i10, (u2.m) obj, intValue);
                    return SpeedPickerSheet$lambda$2;
                }
            };
        }
    }

    public static final sn.z SpeedPickerSheet$lambda$0$0(ho.l lVar) {
        lVar.invoke(new o(22));
        return sn.z.f31622a;
    }

    public static final sn.z SpeedPickerSheet$lambda$0$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onSpeedPickerClose();
        return sn.z.f31622a;
    }

    public static final sn.z SpeedPickerSheet$lambda$1(float f10, ho.l lVar, r1.y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(bottomSheetControl);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new b(bottomSheetControl, 6);
            qVar.h0(L);
        }
        SpeedPickerSheetUI(f10, lVar, t2.u.P, t2.u.P, null, (ho.a) L, qVar, 0, 28);
        return sn.z.f31622a;
    }

    public static final sn.z SpeedPickerSheet$lambda$1$0$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return sn.z.f31622a;
    }

    public static final sn.z SpeedPickerSheet$lambda$2(ho.l lVar, float f10, int i10, u2.m mVar, int i11) {
        SpeedPickerSheet(lVar, f10, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SpeedPickerSheetUI(final float f10, final ho.l lVar, float f11, float f12, List<Float> list, ho.a aVar, u2.m mVar, final int i10, final int i11) {
        int i12;
        float f13;
        int i13;
        int i14;
        float f14;
        int i15;
        int i16;
        List<Float> list2;
        int i17;
        int i18;
        ho.a aVar2;
        int i19;
        int i20;
        boolean z6;
        final ho.a aVar3;
        final float f15;
        final float f16;
        final List<Float> list3;
        r1 r10;
        float f17;
        float f18;
        List<Float> list4;
        boolean z10;
        float f19;
        w0 w0Var;
        i3.t tVar;
        int i21;
        ho.l lVar2;
        boolean z11;
        final w0 w0Var2;
        int i22;
        int i23;
        Float valueOf = Float.valueOf(2.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-953850708);
        if ((i10 & 6) == 0) {
            if (qVar.c(f10)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i12 = i23 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i12 |= i22;
        }
        int i24 = i11 & 4;
        if (i24 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            f13 = f11;
            if (qVar.c(f13)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            i14 = i11 & 8;
            if (i14 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                f14 = f12;
                if (qVar.c(f14)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
                i16 = i11 & 16;
                if (i16 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    list2 = list;
                    if (qVar.h(list2)) {
                        i17 = 16384;
                    } else {
                        i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i12 |= i17;
                    i18 = i11 & 32;
                    if (i18 == 0) {
                        i12 |= 196608;
                        aVar2 = aVar;
                    } else {
                        aVar2 = aVar;
                        if ((i10 & 196608) == 0) {
                            if (qVar.h(aVar2)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                    }
                    i20 = i12;
                    if ((i12 & 74899) == 74898) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar.O(i20 & 1, z6)) {
                        if (i24 != 0) {
                            f17 = 0.25f;
                        } else {
                            f17 = f13;
                        }
                        if (i14 != 0) {
                            f18 = 3.0f;
                        } else {
                            f18 = f14;
                        }
                        if (i16 != 0) {
                            list4 = ig.f.I(Float.valueOf(0.25f), valueOf2, valueOf, Float.valueOf(3.0f));
                        } else {
                            list4 = list2;
                        }
                        u2.e eVar = u2.l.f33918a;
                        if (i18 != 0) {
                            Object L = qVar.L();
                            if (L == eVar) {
                                L = new c(6);
                                qVar.h0(L);
                            }
                            aVar2 = (ho.a) L;
                        }
                        ho.a aVar4 = aVar2;
                        Object L2 = qVar.L();
                        if (L2 == eVar) {
                            L2 = new e1(f10);
                            qVar.h0(L2);
                        }
                        w0 w0Var3 = (w0) L2;
                        i3.q qVar2 = i3.q.f13017a;
                        i3.t e10 = p2.e(qVar2, 1.0f);
                        ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                        int i25 = ElevenLabsTheme.$stable;
                        i3.t I = r1.d.I(e10, t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar, i25).m2358getX6D9Ej5fM(), 7);
                        f1 d10 = r1.p.d(i3.d.f13001e, false);
                        int hashCode = Long.hashCode(qVar.T);
                        c3.o l4 = qVar.l();
                        i3.t c5 = i3.a.c(I, qVar);
                        h4.h.f11920i.getClass();
                        h4.f fVar = h4.g.f11903b;
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(fVar);
                        } else {
                            qVar.k0();
                        }
                        h4.e eVar2 = h4.g.f11907f;
                        u2.r.J(eVar2, d10, qVar);
                        h4.e eVar3 = h4.g.f11906e;
                        u2.r.J(eVar3, l4, qVar);
                        Integer valueOf3 = Integer.valueOf(hashCode);
                        h4.e eVar4 = h4.g.f11908g;
                        u2.r.y(qVar, valueOf3, eVar4);
                        h4.d dVar = h4.g.f11909h;
                        u2.r.F(dVar, qVar);
                        List<Float> list5 = list4;
                        h4.e eVar5 = h4.g.f11905d;
                        u2.r.J(eVar5, c5, qVar);
                        i3.t f20 = ib.i.f(elevenLabsTheme, qVar, i25, p2.e(qVar2, 1.0f));
                        r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                        int hashCode2 = Long.hashCode(qVar.T);
                        c3.o l7 = qVar.l();
                        i3.t c10 = i3.a.c(f20, qVar);
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(fVar);
                        } else {
                            qVar.k0();
                        }
                        u2.r.J(eVar2, a10, qVar);
                        u2.r.J(eVar3, l7, qVar);
                        defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
                        u2.r.J(eVar5, c10, qVar);
                        i3.t e11 = p2.e(qVar2, 1.0f);
                        float SpeedPickerSheetUI$lambda$2 = SpeedPickerSheetUI$lambda$2(w0Var3);
                        no.c cVar = new no.c(f17, f18);
                        String R = kj.c.R(qVar, R.string.player_accessibility_playback_speed);
                        String B = defpackage.f.B(NumberFormatterKt.formatFloat(SpeedPickerSheetUI$lambda$2(w0Var3), qVar, 0), "x");
                        String str = "x";
                        int i26 = i20 & 112;
                        if (i26 == 32) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Object L3 = qVar.L();
                        if (!z10 && L3 != eVar) {
                            w0Var = w0Var3;
                            tVar = e11;
                            i21 = i26;
                            f19 = f18;
                        } else {
                            f19 = f18;
                            w0Var = w0Var3;
                            tVar = e11;
                            i21 = i26;
                            L3 = new io.elevenlabs.data.database.entities.reads.h(lVar, w0Var, 13);
                            qVar.h0(L3);
                        }
                        ho.l lVar3 = (ho.l) L3;
                        Object L4 = qVar.L();
                        if (L4 == eVar) {
                            lVar2 = lVar3;
                            L4 = new c(7);
                            qVar.h0(L4);
                        } else {
                            lVar2 = lVar3;
                        }
                        float f21 = f19;
                        w0 w0Var4 = w0Var;
                        SliderKt.Slider(SpeedPickerSheetUI$lambda$2, lVar2, R, tVar, B, (ho.a) L4, cVar, qVar, 199680, 0);
                        i3.t e12 = p2.e(qVar2, 1.0f);
                        f1 d11 = r1.p.d(i3.d.f12997a, false);
                        int hashCode3 = Long.hashCode(qVar.T);
                        c3.o l10 = qVar.l();
                        i3.t c11 = i3.a.c(e12, qVar);
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(fVar);
                        } else {
                            qVar.k0();
                        }
                        u2.r.J(eVar2, d11, qVar);
                        u2.r.J(eVar3, l10, qVar);
                        defpackage.f.u(hashCode3, qVar, eVar4, qVar, dVar);
                        Iterator s10 = com.google.android.gms.internal.play_billing.b.s(qVar, c11, eVar5, 1739508998, list5);
                        while (s10.hasNext()) {
                            ValueLabel(((Number) s10.next()).floatValue(), f17, f21, qVar, (i20 >> 3) & 1008);
                        }
                        qVar.p(false);
                        qVar.p(true);
                        r1.d.g(p2.f(qVar2, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2351getX10D9Ej5fM()), qVar);
                        i3.t e13 = p2.e(qVar2, 1.0f);
                        k2 a11 = i2.a(r1.j.f29234g, i3.d.f13004y0, qVar, 6);
                        int hashCode4 = Long.hashCode(qVar.T);
                        c3.o l11 = qVar.l();
                        i3.t c12 = i3.a.c(e13, qVar);
                        h4.h.f11920i.getClass();
                        h4.f fVar2 = h4.g.f11903b;
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(fVar2);
                        } else {
                            qVar.k0();
                        }
                        u2.r.J(h4.g.f11907f, a11, qVar);
                        u2.r.J(h4.g.f11906e, l11, qVar);
                        u2.r.y(qVar, Integer.valueOf(hashCode4), h4.g.f11908g);
                        u2.r.F(h4.g.f11909h, qVar);
                        u2.r.J(h4.g.f11905d, c12, qVar);
                        Object L5 = qVar.L();
                        if (L5 == eVar) {
                            L5 = ig.f.I(Float.valueOf(0.5f), Float.valueOf(0.75f), valueOf2, Float.valueOf(1.5f), valueOf);
                            qVar.h0(L5);
                        }
                        qVar.X(-1309720451);
                        for (Iterator it = ((List) L5).iterator(); it.hasNext(); it = it) {
                            final float floatValue = ((Number) it.next()).floatValue();
                            String str2 = str;
                            final String B2 = defpackage.f.B(NumberFormatterKt.formatFloat(floatValue, qVar, 0), str2);
                            boolean c13 = qVar.c(floatValue);
                            int i27 = i21;
                            if (i27 == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            boolean z12 = c13 | z11;
                            Object L6 = qVar.L();
                            if (!z12 && L6 != eVar) {
                                w0Var2 = w0Var4;
                            } else {
                                w0Var2 = w0Var4;
                                L6 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.z
                                    @Override // ho.a
                                    public final Object invoke() {
                                        sn.z SpeedPickerSheetUI$lambda$4$0$3$1$0;
                                        SpeedPickerSheetUI$lambda$4$0$3$1$0 = SpeedPickerSheetKt.SpeedPickerSheetUI$lambda$4$0$3$1$0(floatValue, lVar, w0Var2);
                                        return SpeedPickerSheetUI$lambda$4$0$3$1$0;
                                    }
                                };
                                qVar.h0(L6);
                            }
                            i21 = i27;
                            w0Var4 = w0Var2;
                            u2.q qVar3 = qVar;
                            ButtonContainerKt.m1780ButtonContainer83mGB3Q(B2, (ho.a) L6, m3.h.c(qVar2, ElevenLabsTheme.INSTANCE.getShapes(qVar, ElevenLabsTheme.$stable).getFull()), 0L, false, 0, null, false, null, c3.k.d(-567159738, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.a0
                                @Override // ho.q
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    sn.z SpeedPickerSheetUI$lambda$4$0$3$2;
                                    int intValue = ((Integer) obj3).intValue();
                                    SpeedPickerSheetUI$lambda$4$0$3$2 = SpeedPickerSheetKt.SpeedPickerSheetUI$lambda$4$0$3$2(floatValue, w0Var2, B2, (r1.s) obj, (u2.m) obj2, intValue);
                                    return SpeedPickerSheetUI$lambda$4$0$3$2;
                                }
                            }, qVar), qVar3, 805306368, 504);
                            str = str2;
                            qVar = qVar3;
                        }
                        qVar.p(false);
                        qVar.p(true);
                        r1.d.g(p2.f(qVar2, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2351getX10D9Ej5fM()), qVar);
                        u2.q qVar4 = qVar;
                        ButtonKt.Button(kj.c.R(qVar, R.string.player_reading_speed_save), aVar4, p2.e(qVar2, 1.0f), ButtonSize.Medium, null, null, null, false, false, false, qVar4, ((i20 >> 12) & 112) | 3456, 1008);
                        qVar = qVar4;
                        qVar.p(true);
                        qVar.p(true);
                        f15 = f17;
                        f16 = f21;
                        aVar3 = aVar4;
                        list3 = list5;
                    } else {
                        qVar.R();
                        aVar3 = aVar2;
                        f15 = f13;
                        f16 = f14;
                        list3 = list2;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.b0
                            @Override // ho.p
                            public final Object invoke(Object obj, Object obj2) {
                                sn.z SpeedPickerSheetUI$lambda$5;
                                int intValue = ((Integer) obj2).intValue();
                                SpeedPickerSheetUI$lambda$5 = SpeedPickerSheetKt.SpeedPickerSheetUI$lambda$5(f10, lVar, f15, f16, list3, aVar3, i10, i11, (u2.m) obj, intValue);
                                return SpeedPickerSheetUI$lambda$5;
                            }
                        };
                        return;
                    }
                    return;
                }
                list2 = list;
                i18 = i11 & 32;
                if (i18 == 0) {
                }
                i20 = i12;
                if ((i12 & 74899) == 74898) {
                }
                if (!qVar.O(i20 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            f14 = f12;
            i16 = i11 & 16;
            if (i16 != 0) {
            }
            list2 = list;
            i18 = i11 & 32;
            if (i18 == 0) {
            }
            i20 = i12;
            if ((i12 & 74899) == 74898) {
            }
            if (!qVar.O(i20 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        f13 = f11;
        i14 = i11 & 8;
        if (i14 == 0) {
        }
        f14 = f12;
        i16 = i11 & 16;
        if (i16 != 0) {
        }
        list2 = list;
        i18 = i11 & 32;
        if (i18 == 0) {
        }
        i20 = i12;
        if ((i12 & 74899) == 74898) {
        }
        if (!qVar.O(i20 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final float SpeedPickerSheetUI$lambda$2(w0 w0Var) {
        return ((e1) w0Var).h();
    }

    private static final void SpeedPickerSheetUI$lambda$3(w0 w0Var, float f10) {
        ((e1) w0Var).i(f10);
    }

    public static final sn.z SpeedPickerSheetUI$lambda$4$0$0$0(ho.l lVar, w0 w0Var, float f10) {
        float y10 = jo.a.y(f10 * 10) / 10.0f;
        SpeedPickerSheetUI$lambda$3(w0Var, y10);
        lVar.invoke(new io.elevenlabs.readerapp.ui.screens.authenticated.assistant.r(y10, 1));
        return sn.z.f31622a;
    }

    public static final sn.z SpeedPickerSheetUI$lambda$4$0$0$0$0(float f10, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onSpeedChanged(f10);
        return sn.z.f31622a;
    }

    public static final sn.z SpeedPickerSheetUI$lambda$4$0$3$1$0(float f10, ho.l lVar, w0 w0Var) {
        SpeedPickerSheetUI$lambda$3(w0Var, f10);
        lVar.invoke(new io.elevenlabs.readerapp.ui.screens.authenticated.assistant.r(f10, 2));
        return sn.z.f31622a;
    }

    public static final sn.z SpeedPickerSheetUI$lambda$4$0$3$1$0$0(float f10, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onSpeedChanged(f10);
        return sn.z.f31622a;
    }

    public static final sn.z SpeedPickerSheetUI$lambda$4$0$3$2(float f10, w0 w0Var, String str, r1.s sVar, u2.m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.t tVar = i3.q.f13017a;
            i3.t o6 = p2.o(tVar, 60);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            i3.t h10 = l1.n.h(o6, elevenLabsTheme.getColor(qVar, i11).getBackground().m2005getSecondary0d7_KjU(), elevenLabsTheme.getShapes(qVar, i11).getFull());
            if (f10 == SpeedPickerSheetUI$lambda$2(w0Var)) {
                qVar.X(420352689);
                tVar = l1.n.j(2, defpackage.f.b(elevenLabsTheme, qVar, i11), tVar, elevenLabsTheme.getShapes(qVar, i11).getFull());
                qVar.p(false);
            } else {
                qVar.X(420360174);
                qVar.p(false);
            }
            i3.t E = r1.d.E(h10.then(tVar), elevenLabsTheme.getSpacings(qVar, i11).m2353getX2D9Ej5fM());
            f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            AutoScalingTextKt.m1775AutoScalingTextpB_G1vE(str, null, elevenLabsTheme.getTypo(qVar, i11).getSubtitleMedium700(), 0L, new e5.k(3), 0, false, 0L, 0, qVar, 0, 490);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z SpeedPickerSheetUI$lambda$5(float f10, ho.l lVar, float f11, float f12, List list, ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        SpeedPickerSheetUI(f10, lVar, f11, f12, list, aVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    private static final void ValueLabel(final float f10, final float f11, final float f12, u2.m mVar, final int i10) {
        int i11;
        boolean z6;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(283378480);
        if ((i10 & 6) == 0) {
            if (qVar.c(f10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.c(f11)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar.c(f12)) {
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
        if (qVar.O(i11 & 1, z6)) {
            final y0 bodyTiny500 = ElevenLabsTheme.INSTANCE.getTypo(qVar, ElevenLabsTheme.$stable).getBodyTiny500();
            final s4.w0 j4 = s4.t.j(qVar);
            int i15 = i11 & 14;
            final String B = defpackage.f.B(NumberFormatterKt.formatFloat(f10, qVar, i15), "x");
            boolean f13 = qVar.f(B);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (f13 || L == eVar) {
                L = s4.w0.a(bodyTiny500, 0, j4, B, 0, false, 1020, 0L);
                qVar.h0(L);
            }
            final u0 u0Var = (u0) L;
            float rememberPxToDp = ComposeExtensionsKt.rememberPxToDp((int) (u0Var.f31146c & 4294967295L), (u2.m) qVar, 0);
            if (h5.f.a(rememberPxToDp, 0) > 0) {
                qVar.X(-1776992063);
                i3.t f14 = p2.f(p2.e(i3.q.f13017a, 1.0f), rememberPxToDp);
                boolean h10 = qVar.h(u0Var);
                if (i15 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z13 = z10 | h10;
                if ((i11 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z14 = z13 | z11;
                if ((i11 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean f15 = z12 | z14 | qVar.f(j4) | qVar.f(B) | qVar.f(bodyTiny500);
                Object L2 = qVar.L();
                if (f15 || L2 == eVar) {
                    ho.l lVar = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.c0
                        @Override // ho.l
                        public final Object invoke(Object obj) {
                            sn.z ValueLabel$lambda$1$0;
                            ValueLabel$lambda$1$0 = SpeedPickerSheetKt.ValueLabel$lambda$1$0(u0.this, f10, f11, f12, j4, B, bodyTiny500, (r3.e) obj);
                            return ValueLabel$lambda$1$0;
                        }
                    };
                    qVar.h0(lVar);
                    L2 = lVar;
                }
                l1.n.b((ho.l) L2, f14, qVar, 0);
                qVar.p(false);
            } else {
                qVar.X(-1776299182);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.d0
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z ValueLabel$lambda$2;
                    int intValue = ((Integer) obj2).intValue();
                    ValueLabel$lambda$2 = SpeedPickerSheetKt.ValueLabel$lambda$2(f10, f11, f12, i10, (u2.m) obj, intValue);
                    return ValueLabel$lambda$2;
                }
            };
        }
    }

    public static final sn.z ValueLabel$lambda$1$0(u0 u0Var, float f10, float f11, float f12, s4.w0 w0Var, String str, y0 y0Var, r3.e eVar) {
        eVar.getClass();
        Float valueOf = Float.valueOf(((f10 - f11) / (f12 - f11)) * (Float.intBitsToFloat((int) (eVar.b() >> 32)) - ((int) (u0Var.f31146c >> 32))));
        float intBitsToFloat = Float.intBitsToFloat((int) (eVar.b() >> 32));
        long j4 = u0Var.f31146c;
        float floatValue = ((Number) ae.l.q(valueOf, new no.c(t2.u.P, intBitsToFloat - ((int) (j4 >> 32))))).floatValue();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (eVar.j0() & 4294967295L)) - ((int) (j4 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(floatValue) << 32);
        s4.h hVar = new s4.h(str);
        int i10 = (int) (floatToRawIntBits >> 32);
        int round = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (eVar.b() >> 32)) - Float.intBitsToFloat(i10)));
        if (round < 0) {
            round = 0;
        }
        int i11 = (int) (floatToRawIntBits & 4294967295L);
        int round2 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (eVar.b() & 4294967295L)) - Float.intBitsToFloat(i11)));
        if (round2 < 0) {
            round2 = 0;
        }
        u0 b10 = s4.w0.b(w0Var, hVar, y0Var, 1, true, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, h5.b.a(0, round, 0, round2), eVar.getLayoutDirection(), eVar, null, 1568);
        c1 f02 = eVar.f0();
        long L = f02.L();
        f02.y().o();
        try {
            j8.g gVar = (j8.g) f02.f18786b;
            gVar.X(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
            if (b10.d() && b10.f31144a.f31137f != 3) {
                long j10 = b10.f31146c;
                gVar.O(t2.u.P, t2.u.P, (int) (j10 >> 32), (int) (j10 & 4294967295L), 1);
            }
            s4.x.j(b10.f31145b, eVar.f0().y(), 0L, null, null, null, 30);
            com.google.android.gms.internal.play_billing.b.v(f02, L);
            return sn.z.f31622a;
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.b.v(f02, L);
            throw th;
        }
    }

    public static final sn.z ValueLabel$lambda$2(float f10, float f11, float f12, int i10, u2.m mVar, int i11) {
        ValueLabel(f10, f11, f12, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
