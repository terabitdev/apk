package io.elevenlabs.ui.components;

import a2.k3;
import android.gov.nist.javax.sip.header.ParameterNames;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a;\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u000b¨\u0006\f"}, d2 = {"", "title", "iconUrl", "Lkotlin/Function0;", "Lsn/z;", "onPress", "BottomSheetList", "(Ljava/lang/String;Ljava/lang/String;Lho/a;Lu2/m;I)V", "Lkotlin/Function1;", "Lp3/x;", ParameterNames.ICON, "(Ljava/lang/String;Lho/q;Lho/a;Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BottomSheetListKt {
    public static final void BottomSheetList(String str, ho.q qVar, ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        str.getClass();
        qVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-335983052);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(qVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(aVar)) {
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
            ButtonContainerKt.m1780ButtonContainer83mGB3Q(str, aVar, null, 0L, false, 0, null, false, null, c3.k.d(-1137032168, true, new n(str, qVar, 0), qVar2), qVar2, (i11 & 14) | 805306368 | ((i11 >> 3) & 112), 508);
        } else {
            qVar2.R();
        }
        u2.r1 r10 = qVar2.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 25, str, qVar, aVar);
        }
    }

    public static final sn.z BottomSheetList$lambda$0(String str, String str2, ho.a aVar, int i10, u2.m mVar, int i11) {
        BottomSheetList(str, str2, aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final sn.z BottomSheetList$lambda$1(String str, ho.q qVar, r1.s sVar, u2.m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar2 = (u2.q) mVar;
        if (qVar2.O(i10 & 1, z6)) {
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            float m2357getX5D9Ej5fM = elevenLabsTheme.getSpacings(qVar2, 6).m2357getX5D9Ej5fM();
            float m2360getX8D9Ej5fM = elevenLabsTheme.getSpacings(qVar2, 6).m2360getX8D9Ej5fM();
            i3.q qVar3 = i3.q.f13017a;
            i3.t G = r1.d.G(r1.d.I(qVar3, m2357getX5D9Ej5fM, t2.u.P, m2360getX8D9Ej5fM, t2.u.P, 10), t2.u.P, elevenLabsTheme.getSpacings(qVar2, 6).m2356getX4D9Ej5fM(), 1);
            r1.k2 a10 = r1.i2.a(r1.j.f29228a, i3.d.f13004y0, qVar2, 0);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(G, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar2);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar2, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar2);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar2);
            i3.t o6 = r1.p2.o(qVar3, 24);
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode2 = Long.hashCode(qVar2.T);
            c3.o l7 = qVar2.l();
            i3.t c10 = i3.a.c(o6, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(eVar, d10, qVar2);
            u2.r.J(eVar2, l7, qVar2);
            defpackage.f.u(hashCode2, qVar2, eVar3, qVar2, dVar);
            u2.r.J(eVar4, c10, qVar2);
            qVar.invoke(new p3.x(defpackage.f.b(elevenLabsTheme, qVar2, 6)), qVar2, 0);
            qVar2.p(true);
            r1.d.g(r1.p2.s(qVar3, elevenLabsTheme.getSpacings(qVar2, 6).m2356getX4D9Ej5fM()), qVar2);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            j7.d(str, new r1.m1(1.0f, true), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, 6).getBodyLarge500(), qVar2, 0, 0, 131068);
            qVar2.p(true);
        } else {
            qVar2.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z BottomSheetList$lambda$2(String str, ho.q qVar, ho.a aVar, int i10, u2.m mVar, int i11) {
        BottomSheetList(str, qVar, aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void BottomSheetList(String str, final String str2, ho.a aVar, u2.m mVar, int i10) {
        int i11;
        str.getClass();
        str2.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1844622529);
        if ((i10 & 6) == 0) {
            i11 = (qVar.f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= qVar.f(str2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= qVar.h(aVar) ? RpcError.MAX_MESSAGE_BYTES : 128;
        }
        if (qVar.O(i11 & 1, (i11 & 147) != 146)) {
            BottomSheetList(str, c3.k.d(537319182, true, new ho.q() { // from class: io.elevenlabs.ui.components.BottomSheetListKt$BottomSheetList$1
                @Override // ho.q
                public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    m1779invokeek8zF_U(((p3.x) obj).f26440a, (u2.m) obj2, ((Number) obj3).intValue());
                    return sn.z.f31622a;
                }

                /* renamed from: invoke-ek8zF_U, reason: not valid java name */
                public final void m1779invokeek8zF_U(long j4, u2.m mVar2, int i12) {
                    boolean z6;
                    int i13;
                    if ((i12 & 6) == 0) {
                        if (((u2.q) mVar2).e(j4)) {
                            i13 = 4;
                        } else {
                            i13 = 2;
                        }
                        i12 |= i13;
                    }
                    if ((i12 & 19) != 18) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    u2.q qVar2 = (u2.q) mVar2;
                    if (qVar2.O(i12 & 1, z6)) {
                        RemoteIconKt.m1870RemoteIconFNF3uiM(str2, r1.p2.d(i3.q.f13017a, 1.0f), j4, qVar2, ((i12 << 6) & 896) | 48, 0);
                    } else {
                        qVar2.R();
                    }
                }
            }, qVar), aVar, qVar, (i11 & 896) | (i11 & 14) | 48);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.a(str, str2, aVar, i10, 1);
        }
    }
}
