package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import java.util.Iterator;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0081\u0001\u0010\u000f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\b\u0010\n\u001a\u0004\u0018\u00018\u00002\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00032\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a7\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u0013\u001a#\u0010\u0015\u001a\u00020\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {TokenNames.T, "Lt1/z;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "Lsn/z;", "onTabChange", "", "getTabText", "", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "activeTab", "", "getTabIcon", "Lr1/z1;", "contentPadding", "ChipGroup", "(Lt1/z;Lho/l;Lho/q;Ljava/lang/Iterable;Ljava/lang/Object;Lho/q;Lr1/z1;Lu2/m;II)V", "Lt1/t;", "chips", "(Lt1/z;Lr1/z1;Lho/l;Lu2/m;II)V", "Lr1/v0;", "ChipFlowGroup", "(Lho/q;Lu2/m;I)V", "Preview_ChipGroup", "(Lu2/m;I)V", "Preview_ChipFlowGroup", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ChipGroupKt {
    public static final void ChipFlowGroup(ho.q qVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        qVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-26792199);
        if ((i10 & 6) == 0) {
            if (qVar2.h(qVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            i3.t G = r1.d.G(i3.q.f13017a, elevenLabsTheme.getSpacings(qVar2, 6).m2356getX4D9Ej5fM(), t2.u.P, 2);
            r1.u0 u0Var = r1.j.f29228a;
            r1.d.b(G, r1.j.h(elevenLabsTheme.getSpacings(qVar2, 6).m2353getX2D9Ej5fM(), i3.d.B0), r1.j.i(elevenLabsTheme.getSpacings(qVar2, 6).m2353getX2D9Ej5fM(), i3.d.f13005z0), null, 0, 0, c3.k.d(-1817942284, true, new u(qVar, 1), qVar2), qVar2, 1572864, 56);
        } else {
            qVar2.R();
        }
        u2.r1 r10 = qVar2.r();
        if (r10 != null) {
            r10.f34012d = new em.a(qVar, i10, 8);
        }
    }

    public static final sn.z ChipFlowGroup$lambda$0(ho.q qVar, r1.v0 v0Var, u2.m mVar, int i10) {
        boolean z6;
        int i11;
        v0Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(v0Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar2 = (u2.q) mVar;
        if (qVar2.O(i10 & 1, z6)) {
            qVar.invoke(v0Var, qVar2, Integer.valueOf(i10 & 14));
        } else {
            qVar2.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ChipFlowGroup$lambda$1(ho.q qVar, int i10, u2.m mVar, int i11) {
        ChipFlowGroup(qVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final <T> void ChipGroup(t1.z zVar, final ho.l lVar, final ho.q qVar, final Iterable<? extends T> iterable, final T t10, ho.q qVar2, r1.z1 z1Var, u2.m mVar, final int i10, final int i11) {
        t1.z zVar2;
        int i12;
        final ho.l lVar2;
        ho.q qVar3;
        r1.z1 z1Var2;
        boolean z6;
        u2.q qVar4;
        final ho.q qVar5;
        final r1.z1 z1Var3;
        u2.r1 r10;
        ho.p pVar;
        ho.q qVar6;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        boolean h10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        lVar.getClass();
        qVar.getClass();
        iterable.getClass();
        u2.q qVar7 = (u2.q) mVar;
        qVar7.Z(-1447740080);
        if ((i10 & 6) == 0) {
            if ((i11 & 1) == 0) {
                zVar2 = zVar;
                if (qVar7.f(zVar2)) {
                    i19 = 4;
                    i12 = i19 | i10;
                }
            } else {
                zVar2 = zVar;
            }
            i19 = 2;
            i12 = i19 | i10;
        } else {
            zVar2 = zVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            lVar2 = lVar;
            if (qVar7.h(lVar2)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        } else {
            lVar2 = lVar;
        }
        if ((i10 & 384) == 0) {
            if (qVar7.h(qVar)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        }
        if ((i10 & 3072) == 0) {
            if (qVar7.h(iterable)) {
                i16 = 2048;
            } else {
                i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i16;
        }
        if ((i10 & 24576) == 0) {
            if ((i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) == 0) {
                h10 = qVar7.f(t10);
            } else {
                h10 = qVar7.h(t10);
            }
            if (h10) {
                i15 = 16384;
            } else {
                i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i15;
        }
        if ((i10 & 196608) == 0) {
            if ((i11 & 32) == 0) {
                qVar3 = qVar2;
                if (qVar7.h(qVar3)) {
                    i14 = 131072;
                    i12 |= i14;
                }
            } else {
                qVar3 = qVar2;
            }
            i14 = 65536;
            i12 |= i14;
        } else {
            qVar3 = qVar2;
        }
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                z1Var2 = z1Var;
                if (qVar7.f(z1Var2)) {
                    i13 = 1048576;
                    i12 |= i13;
                }
            } else {
                z1Var2 = z1Var;
            }
            i13 = 524288;
            i12 |= i13;
        } else {
            z1Var2 = z1Var;
        }
        if ((i12 & 599187) != 599186) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar7.O(i12 & 1, z6)) {
            qVar7.T();
            if ((i10 & 1) != 0 && !qVar7.y()) {
                qVar7.R();
                if ((i11 & 1) != 0) {
                    i12 &= -15;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                }
                z10 = false;
                qVar5 = qVar3;
            } else {
                if ((i11 & 1) != 0) {
                    zVar2 = t1.b0.a(0, qVar7, 3);
                    i12 &= -15;
                }
                if ((i11 & 32) != 0) {
                    qVar6 = new c0(2);
                    i12 &= -458753;
                } else {
                    qVar6 = qVar3;
                }
                if ((i11 & 64) != 0) {
                    float m2356getX4D9Ej5fM = ElevenLabsTheme.INSTANCE.getSpacings(qVar7, 6).m2356getX4D9Ej5fM();
                    z1Var2 = new r1.d2(m2356getX4D9Ej5fM, m2356getX4D9Ej5fM, m2356getX4D9Ej5fM, m2356getX4D9Ej5fM);
                    i12 &= -3670017;
                }
                qVar5 = qVar6;
                z10 = false;
            }
            int i20 = i12;
            final r1.z1 z1Var4 = z1Var2;
            qVar7.q();
            if (tn.o.o0(iterable) <= 1) {
                r10 = qVar7.r();
                if (r10 != null) {
                    final t1.z zVar3 = zVar2;
                    final int i21 = 0;
                    pVar = new ho.p() { // from class: io.elevenlabs.ui.components.d0
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            sn.z ChipGroup$lambda$1;
                            sn.z ChipGroup$lambda$3;
                            switch (i21) {
                                case 0:
                                    int intValue = ((Integer) obj2).intValue();
                                    ChipGroup$lambda$1 = ChipGroupKt.ChipGroup$lambda$1(zVar3, lVar2, qVar, iterable, t10, qVar5, z1Var4, i10, i11, (u2.m) obj, intValue);
                                    return ChipGroup$lambda$1;
                                default:
                                    int intValue2 = ((Integer) obj2).intValue();
                                    ChipGroup$lambda$3 = ChipGroupKt.ChipGroup$lambda$3(zVar3, lVar2, qVar, iterable, t10, qVar5, z1Var4, i10, i11, (u2.m) obj, intValue2);
                                    return ChipGroup$lambda$3;
                            }
                        }
                    };
                    r10.f34012d = pVar;
                }
                return;
            }
            t1.z zVar4 = zVar2;
            boolean h11 = qVar7.h(iterable);
            if ((i20 & 896) == 256) {
                z11 = true;
            } else {
                z11 = z10;
            }
            boolean z14 = h11 | z11;
            if ((57344 & i20) != 16384 && ((i20 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) == 0 || !qVar7.h(t10))) {
                z12 = z10;
            } else {
                z12 = true;
            }
            boolean z15 = z14 | z12;
            if ((((458752 & i20) ^ 196608) > 131072 && qVar7.f(qVar5)) || (i20 & 196608) == 131072) {
                z13 = true;
            } else {
                z13 = z10;
            }
            boolean z16 = z15 | z13;
            if ((i20 & 112) == 32) {
                z10 = true;
            }
            boolean z17 = z16 | z10;
            Object L = qVar7.L();
            if (z17 || L == u2.l.f33918a) {
                ho.q qVar8 = qVar5;
                io.elevenlabs.highlighter.h hVar = new io.elevenlabs.highlighter.h(iterable, qVar, i20, t10, qVar8, lVar);
                qVar5 = qVar8;
                qVar7.h0(hVar);
                L = hVar;
            }
            int i22 = (i20 & 14) | ((i20 >> 15) & 112);
            qVar4 = qVar7;
            zVar2 = zVar4;
            ChipGroup(zVar2, z1Var4, (ho.l) L, qVar4, i22, 0);
            z1Var3 = z1Var4;
        } else {
            qVar4 = qVar7;
            qVar4.R();
            qVar5 = qVar3;
            z1Var3 = z1Var2;
        }
        final t1.z zVar5 = zVar2;
        r10 = qVar4.r();
        if (r10 != null) {
            final int i23 = 1;
            pVar = new ho.p() { // from class: io.elevenlabs.ui.components.d0
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z ChipGroup$lambda$1;
                    sn.z ChipGroup$lambda$3;
                    switch (i23) {
                        case 0:
                            int intValue = ((Integer) obj2).intValue();
                            ChipGroup$lambda$1 = ChipGroupKt.ChipGroup$lambda$1(zVar5, lVar, qVar, iterable, t10, qVar5, z1Var3, i10, i11, (u2.m) obj, intValue);
                            return ChipGroup$lambda$1;
                        default:
                            int intValue2 = ((Integer) obj2).intValue();
                            ChipGroup$lambda$3 = ChipGroupKt.ChipGroup$lambda$3(zVar5, lVar, qVar, iterable, t10, qVar5, z1Var3, i10, i11, (u2.m) obj, intValue2);
                            return ChipGroup$lambda$3;
                    }
                }
            };
            r10.f34012d = pVar;
        }
    }

    public static final Integer ChipGroup$lambda$0(Object obj, u2.m mVar, int i10) {
        u2.q qVar = (u2.q) mVar;
        qVar.X(-45695319);
        qVar.p(false);
        return null;
    }

    public static final sn.z ChipGroup$lambda$1(t1.z zVar, ho.l lVar, ho.q qVar, Iterable iterable, Object obj, ho.q qVar2, r1.z1 z1Var, int i10, int i11, u2.m mVar, int i12) {
        ChipGroup(zVar, lVar, qVar, iterable, obj, qVar2, z1Var, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final sn.z ChipGroup$lambda$2$0(Iterable iterable, ho.q qVar, int i10, Object obj, ho.q qVar2, ho.l lVar, t1.t tVar) {
        tVar.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ho.q qVar3 = qVar;
            int i11 = i10;
            Object obj2 = obj;
            t1.t.c(tVar, null, null, new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.player.contents.k(qVar3, it.next(), i11, obj2, qVar2, lVar), true, 1416376260), 3);
            qVar = qVar3;
            i10 = i11;
            obj = obj2;
        }
        return sn.z.f31622a;
    }

    public static final sn.z ChipGroup$lambda$2$0$0$0(ho.q qVar, Object obj, int i10, Object obj2, ho.q qVar2, ho.l lVar, t1.b bVar, u2.m mVar, int i11) {
        boolean z6;
        bVar.getClass();
        if ((i11 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar3 = (u2.q) mVar;
        if (qVar3.O(i11 & 1, z6)) {
            int i12 = (i10 >> 12) & 8;
            String str = (String) qVar.invoke(obj, qVar3, Integer.valueOf(i12));
            boolean c5 = kotlin.jvm.internal.m.c(obj2, obj);
            Integer num = (Integer) qVar2.invoke(obj, qVar3, Integer.valueOf(i12));
            ChipIconPosition chipIconPosition = ChipIconPosition.Start;
            i3.t v9 = r1.p2.v(i3.q.f13017a, null, 3);
            boolean f10 = qVar3.f(lVar) | qVar3.h(obj);
            Object L = qVar3.L();
            if (f10 || L == u2.l.f33918a) {
                L = new b0(lVar, obj, 0);
                qVar3.h0(L);
            }
            ChipKt.Chip(str, v9, c5, num, null, chipIconPosition, (ho.a) L, null, null, qVar3, 196656, 400);
        } else {
            qVar3.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ChipGroup$lambda$2$0$0$0$0$0(ho.l lVar, Object obj) {
        lVar.invoke(obj);
        return sn.z.f31622a;
    }

    public static final sn.z ChipGroup$lambda$3(t1.z zVar, ho.l lVar, ho.q qVar, Iterable iterable, Object obj, ho.q qVar2, r1.z1 z1Var, int i10, int i11, u2.m mVar, int i12) {
        ChipGroup(zVar, lVar, qVar, iterable, obj, qVar2, z1Var, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final sn.z ChipGroup$lambda$4$0(ho.l lVar, t1.t tVar) {
        tVar.getClass();
        lVar.invoke(tVar);
        return sn.z.f31622a;
    }

    public static final sn.z ChipGroup$lambda$5(t1.z zVar, r1.z1 z1Var, ho.l lVar, int i10, int i11, u2.m mVar, int i12) {
        ChipGroup(zVar, z1Var, lVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_ChipFlowGroup(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-536655348);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ChipFlowGroup(ComposableSingletons$ChipGroupKt.INSTANCE.m1798getLambda$1403954128$ui_release(), qVar, 6);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 3);
        }
    }

    public static final sn.z Preview_ChipFlowGroup$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ChipFlowGroup(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ChipGroup(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1152314394);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            i3.t c5 = i3.a.c(qVar2, qVar);
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
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new z(0);
                qVar.h0(L);
            }
            ChipGroup(null, (ho.l) L, new c0(0), ig.f.I("One", "Two", "Three"), "One", null, null, qVar, 27696, 97);
            r1.d.g(r1.p2.f(qVar2, ElevenLabsTheme.INSTANCE.getSpacings(qVar, 6).m2356getX4D9Ej5fM()), qVar);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new z(1);
                qVar.h0(L2);
            }
            ChipGroup(null, (ho.l) L2, new c0(1), ig.f.I("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"), "Two", null, null, qVar, 27696, 97);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 2);
        }
    }

    public static final sn.z Preview_ChipGroup$lambda$0$0$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final String Preview_ChipGroup$lambda$0$1(String str, u2.m mVar, int i10) {
        str.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.X(-1831211846);
        qVar.p(false);
        return str;
    }

    public static final sn.z Preview_ChipGroup$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final String Preview_ChipGroup$lambda$0$3(String str, u2.m mVar, int i10) {
        str.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.X(-326608911);
        qVar.p(false);
        return str;
    }

    public static final sn.z Preview_ChipGroup$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ChipGroup(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChipGroup(t1.z zVar, r1.z1 z1Var, ho.l lVar, u2.m mVar, int i10, int i11) {
        t1.z zVar2;
        int i12;
        r1.z1 z1Var2;
        t1.z zVar3;
        int i13;
        r1.z1 z1Var3;
        boolean z6;
        Object L;
        int i14;
        int i15;
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-474828604);
        if ((i10 & 6) == 0) {
            if ((i11 & 1) == 0) {
                zVar2 = zVar;
                if (qVar.f(zVar2)) {
                    i15 = 4;
                    i12 = i15 | i10;
                }
            } else {
                zVar2 = zVar;
            }
            i15 = 2;
            i12 = i15 | i10;
        } else {
            zVar2 = zVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                z1Var2 = z1Var;
                if (qVar.f(z1Var2)) {
                    i14 = 32;
                    i12 |= i14;
                }
            } else {
                z1Var2 = z1Var;
            }
            i14 = 16;
            i12 |= i14;
        } else {
            z1Var2 = z1Var;
        }
        if ((i10 & 384) == 0) {
            i12 |= qVar.h(lVar) ? 256 : 128;
        }
        if (qVar.O(i12 & 1, (i12 & 147) != 146)) {
            qVar.T();
            if ((i10 & 1) == 0 || qVar.y()) {
                if ((i11 & 1) != 0) {
                    zVar2 = t1.b0.a(0, qVar, 3);
                    i12 &= -15;
                }
                if ((i11 & 2) != 0) {
                    float m2356getX4D9Ej5fM = ElevenLabsTheme.INSTANCE.getSpacings(qVar, 6).m2356getX4D9Ej5fM();
                    r1.d2 d2Var = new r1.d2(m2356getX4D9Ej5fM, m2356getX4D9Ej5fM, m2356getX4D9Ej5fM, m2356getX4D9Ej5fM);
                    i12 &= -113;
                    i13 = 3;
                    z1Var3 = d2Var;
                    qVar.q();
                    r1.u0 u0Var = r1.j.f29228a;
                    r1.h n2 = ib.i.n(ElevenLabsTheme.INSTANCE, qVar, 6);
                    z6 = true;
                    i3.k kVar = i3.d.f13005z0;
                    if ((i12 & 896) != 256) {
                        z6 = false;
                    }
                    L = qVar.L();
                    if (!z6 || L == u2.l.f33918a) {
                        L = new a0(lVar, 0);
                        qVar.h0(L);
                    }
                    int i16 = i12 << i13;
                    t1.z zVar4 = zVar2;
                    rd.c1.d(null, zVar4, z1Var3, n2, kVar, null, false, null, (ho.l) L, qVar, (i16 & 112) | 196608 | (i16 & 896), 457);
                    zVar3 = zVar4;
                    z1Var2 = z1Var3;
                }
            } else {
                qVar.R();
                if ((i11 & 1) != 0) {
                    i12 &= -15;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
            }
            z1Var3 = z1Var2;
            i13 = 3;
            qVar.q();
            r1.u0 u0Var2 = r1.j.f29228a;
            r1.h n22 = ib.i.n(ElevenLabsTheme.INSTANCE, qVar, 6);
            z6 = true;
            i3.k kVar2 = i3.d.f13005z0;
            if ((i12 & 896) != 256) {
            }
            L = qVar.L();
            if (!z6) {
            }
            L = new a0(lVar, 0);
            qVar.h0(L);
            int i162 = i12 << i13;
            t1.z zVar42 = zVar2;
            rd.c1.d(null, zVar42, z1Var3, n22, kVar2, null, false, null, (ho.l) L, qVar, (i162 & 112) | 196608 | (i162 & 896), 457);
            zVar3 = zVar42;
            z1Var2 = z1Var3;
        } else {
            qVar.R();
            zVar3 = zVar2;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(zVar3, z1Var2, lVar, i10, i11, 27);
        }
    }
}
