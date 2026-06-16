package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.extensions.BoxShadow;
import io.elevenlabs.ui.extensions.BoxShadowKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a]\u0010\u000b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aW\u0010\u000b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\u000e\u001a[\u0010\u000f\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001aU\u0010\u000f\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000f\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0013\u001a\u000f\u0010\u0016\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0016\u0010\u0013\u001a\u000f\u0010\u0017\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onDismissRequest", "onConfirm", "", "title", ParameterNames.TEXT, "dismissText", "confirmText", "", "isDangerAction", "ConfirmationDialog", "(Lho/a;Lho/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLu2/m;II)V", FirebaseAnalytics.Param.CONTENT, "(Lho/a;Lho/a;Lho/p;Ljava/lang/String;Ljava/lang/String;ZLu2/m;II)V", "ConfirmationDialogContent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lho/a;Ljava/lang/String;Lho/a;ZLu2/m;II)V", "(Ljava/lang/String;Lho/a;Ljava/lang/String;Lho/a;Lho/p;ZLu2/m;I)V", "Preview_ConfirmationDialog", "(Lu2/m;I)V", "Preview_ConfirmationDialog_NotDanger", "Preview_ConfirmationDialog_No_Title", "Preview_ConfirmationDialog_No_Button", "Preview_ConfirmationDialog_No_Buttons", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ConfirmationDialogKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConfirmationDialog(final ho.a aVar, final ho.a aVar2, String str, final String str2, final String str3, final String str4, boolean z6, u2.m mVar, int i10, int i11) {
        int i12;
        String str5;
        int i13;
        int i14;
        boolean z10;
        int i15;
        boolean z11;
        String str6;
        boolean z12;
        u2.r1 r10;
        boolean z13;
        final String str7;
        final boolean z14;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        aVar.getClass();
        aVar2.getClass();
        str2.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2065622541);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar2)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        int i21 = i11 & 4;
        if (i21 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            str5 = str;
            if (qVar.f(str5)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i10 & 3072) == 0) {
                if (qVar.f(str2)) {
                    i18 = 2048;
                } else {
                    i18 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i18;
            }
            if ((i10 & 24576) == 0) {
                if (qVar.f(str3)) {
                    i17 = 16384;
                } else {
                    i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i17;
            }
            if ((196608 & i10) == 0) {
                if (qVar.f(str4)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            i14 = i11 & 64;
            if (i14 == 0) {
                i12 |= 1572864;
            } else if ((1572864 & i10) == 0) {
                z10 = z6;
                if (qVar.g(z10)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i12 |= i15;
                if ((599187 & i12) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (qVar.O(i12 & 1, z11)) {
                    if (i21 != 0) {
                        str7 = null;
                        z13 = true;
                    } else {
                        z13 = true;
                        str7 = str5;
                    }
                    if (i14 != 0) {
                        z14 = z13;
                    } else {
                        z14 = z10;
                    }
                    q2.i.d(aVar, null, null, c3.k.d(200770887, z13, new ho.p() { // from class: io.elevenlabs.ui.components.q0
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            sn.z ConfirmationDialog$lambda$0;
                            int intValue = ((Integer) obj2).intValue();
                            ConfirmationDialog$lambda$0 = ConfirmationDialogKt.ConfirmationDialog$lambda$0(str7, str2, str3, aVar, str4, aVar2, z14, (u2.m) obj, intValue);
                            return ConfirmationDialog$lambda$0;
                        }
                    }, qVar), qVar, (i12 & 14) | 3072, 6);
                    str6 = str7;
                    z12 = z14;
                } else {
                    qVar.R();
                    str6 = str5;
                    z12 = z10;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new o0(aVar, aVar2, str6, str2, str3, str4, z12, i10, i11);
                    return;
                }
                return;
            }
            z10 = z6;
            if ((599187 & i12) != 599186) {
            }
            if (qVar.O(i12 & 1, z11)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        str5 = str;
        if ((i10 & 3072) == 0) {
        }
        if ((i10 & 24576) == 0) {
        }
        if ((196608 & i10) == 0) {
        }
        i14 = i11 & 64;
        if (i14 == 0) {
        }
        z10 = z6;
        if ((599187 & i12) != 599186) {
        }
        if (qVar.O(i12 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z ConfirmationDialog$lambda$0(String str, String str2, String str3, ho.a aVar, String str4, ho.a aVar2, boolean z6, u2.m mVar, int i10) {
        boolean z10;
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            ConfirmationDialogContent(str, str2, str3, aVar, str4, aVar2, z6, qVar, 0, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ConfirmationDialog$lambda$1(ho.a aVar, ho.a aVar2, String str, String str2, String str3, String str4, boolean z6, int i10, int i11, u2.m mVar, int i12) {
        ConfirmationDialog(aVar, aVar2, str, str2, str3, str4, z6, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final sn.z ConfirmationDialog$lambda$2(String str, ho.a aVar, String str2, ho.a aVar2, ho.p pVar, boolean z6, u2.m mVar, int i10) {
        boolean z10;
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            ConfirmationDialogContent(str, aVar, str2, aVar2, pVar, z6, qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ConfirmationDialog$lambda$3(ho.a aVar, ho.a aVar2, ho.p pVar, String str, String str2, boolean z6, int i10, int i11, u2.m mVar, int i12) {
        ConfirmationDialog(aVar, aVar2, pVar, str, str2, z6, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    private static final void ConfirmationDialogContent(String str, ho.a aVar, String str2, ho.a aVar2, ho.p pVar, boolean z6, u2.m mVar, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        ButtonVariant buttonVariant;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-964974665);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar.f(str2)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i11 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar2)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i14;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(pVar)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i13;
        }
        if ((196608 & i10) == 0) {
            if (qVar.g(z6)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i11 |= i12;
        }
        int i18 = i11;
        if ((i18 & 74899) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i18 & 1, z10)) {
            BoxShadow[] boxShadowArr = {new BoxShadow(p3.x.b(0.2f, p3.x.f26427b), 20, t2.u.P, (Float.floatToRawIntBits(0) << 32) | (Float.floatToRawIntBits(10) & 4294967295L), false, 20, null)};
            i3.q qVar2 = i3.q.f13017a;
            i3.t boxShadow$default = BoxShadowKt.boxShadow$default(qVar2, boxShadowArr, null, false, 6, null);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            i3.t E = r1.d.E(l1.n.h(m3.h.c(boxShadow$default, elevenLabsTheme.getShapes(qVar, 6).getMd()), ib.i.d(elevenLabsTheme, qVar, 6), p3.h0.f26395b), elevenLabsTheme.getSpacings(qVar, 6).m2358getX6D9Ej5fM());
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
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
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            pVar.invoke(qVar, Integer.valueOf((i18 >> 12) & 14));
            r1.d.g(r1.p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, 6).m2358getX6D9Ej5fM()), qVar);
            r1.u0 u0Var = r1.j.f29229b;
            i3.t e10 = r1.p2.e(qVar2, 1.0f);
            r1.k2 a11 = r1.i2.a(u0Var, i3.d.f13004y0, qVar, 6);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(e10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a11, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            if (str != null) {
                qVar.X(-2140872646);
                z11 = false;
                ButtonKt.Button(str, aVar, null, ButtonSize.Small, ButtonVariant.Quaternary, null, null, false, false, false, qVar, (i18 & 14) | 27648 | (i18 & 112), 996);
                qVar.p(false);
            } else {
                z11 = false;
                qVar.X(-2140652143);
                qVar.p(false);
            }
            if (str2 != null) {
                qVar.X(-2140588655);
                if (z6) {
                    buttonVariant = ButtonVariant.DangerLight;
                } else {
                    buttonVariant = ButtonVariant.Primary;
                }
                ButtonVariant buttonVariant2 = buttonVariant;
                int i19 = i18 >> 6;
                ButtonKt.Button(str2, aVar2, null, ButtonSize.Small, buttonVariant2, null, null, false, false, false, qVar, (i19 & 14) | 3072 | (i19 & 112), 996);
                qVar.p(z11);
            } else {
                qVar.X(-2140328751);
                qVar.p(z11);
            }
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new p0(str, aVar, str2, aVar2, pVar, z6, i10);
        }
    }

    public static final sn.z ConfirmationDialogContent$lambda$0(String str, String str2, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            if (str != null && !wq.n.m0(str)) {
                qVar.X(569099476);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                j7.d(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyMedium700(), qVar, 0, 0, 131070);
                r1.d.g(r1.p2.f(i3.q.f13017a, elevenLabsTheme.getSpacings(qVar, 6).m2355getX3D9Ej5fM()), qVar);
                qVar.p(false);
            } else {
                qVar.X(569323389);
                qVar.p(false);
            }
            j7.d(str2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ElevenLabsTheme.INSTANCE.getTypo(qVar, 6).getBodyLarge500(), qVar, 0, 0, 131070);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ConfirmationDialogContent$lambda$1(String str, String str2, String str3, ho.a aVar, String str4, ho.a aVar2, boolean z6, int i10, int i11, u2.m mVar, int i12) {
        ConfirmationDialogContent(str, str2, str3, aVar, str4, aVar2, z6, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final sn.z ConfirmationDialogContent$lambda$3(String str, ho.a aVar, String str2, ho.a aVar2, ho.p pVar, boolean z6, int i10, u2.m mVar, int i11) {
        ConfirmationDialogContent(str, aVar, str2, aVar2, pVar, z6, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ConfirmationDialog(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1444227664);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new m0(20);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new m0(21);
                qVar.h0(L2);
            }
            ConfirmationDialogContent("Title", "Text", "Dismiss", aVar, "Confirm", (ho.a) L2, true, qVar, 1797558, 0);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 5);
        }
    }

    public static final sn.z Preview_ConfirmationDialog$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_ConfirmationDialog(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ConfirmationDialog_No_Button(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1474778207);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new m0(22);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new m0(23);
                qVar.h0(L2);
            }
            ConfirmationDialogContent(null, "Text", "Dismiss", aVar, null, (ho.a) L2, true, qVar, 1797552, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 6);
        }
    }

    public static final sn.z Preview_ConfirmationDialog_No_Button$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_ConfirmationDialog_No_Button(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ConfirmationDialog_No_Buttons(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-528264174);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new m0(26);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new m0(27);
                qVar.h0(L2);
            }
            ConfirmationDialogContent(null, "Text", null, aVar, null, (ho.a) L2, true, qVar, 1797552, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 8);
        }
    }

    public static final sn.z Preview_ConfirmationDialog_No_Buttons$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_ConfirmationDialog_No_Buttons(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ConfirmationDialog_No_Title(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1244278693);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new m0(28);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new m0(29);
                qVar.h0(L2);
            }
            ConfirmationDialogContent(null, "Text", "Dismiss", aVar, "Confirm", (ho.a) L2, true, qVar, 1797552, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 9);
        }
    }

    public static final sn.z Preview_ConfirmationDialog_No_Title$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_ConfirmationDialog_No_Title(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ConfirmationDialog_NotDanger(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-695721511);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new m0(24);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new m0(25);
                qVar.h0(L2);
            }
            ConfirmationDialogContent("Title", "Text", "Dismiss", aVar, "Confirm", (ho.a) L2, false, qVar, 1797558, 0);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 7);
        }
    }

    public static final sn.z Preview_ConfirmationDialog_NotDanger$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_ConfirmationDialog_NotDanger(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConfirmationDialog(ho.a aVar, ho.a aVar2, ho.p pVar, String str, String str2, boolean z6, u2.m mVar, int i10, int i11) {
        int i12;
        boolean z10;
        boolean z11;
        u2.r1 r10;
        aVar.getClass();
        aVar2.getClass();
        pVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(109331244);
        if ((i10 & 6) == 0) {
            i12 = (qVar.h(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= qVar.h(aVar2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= qVar.h(pVar) ? RpcError.MAX_MESSAGE_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= qVar.f(str) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i10 & 24576) == 0) {
            i12 |= qVar.f(str2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        int i13 = i11 & 32;
        if (i13 != 0) {
            i12 |= 196608;
        } else if ((196608 & i10) == 0) {
            z10 = z6;
            i12 |= qVar.g(z10) ? 131072 : 65536;
            if (!qVar.O(i12 & 1, (74899 & i12) == 74898)) {
                boolean z12 = i13 != 0 ? true : z10;
                q2.i.d(aVar, null, null, c3.k.d(-1873604890, true, new id.w0(str, aVar, str2, aVar2, pVar, z12), qVar), qVar, (i12 & 14) | 3072, 6);
                z11 = z12;
            } else {
                qVar.R();
                z11 = z10;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.ocr.o(aVar, aVar2, pVar, str, str2, z11, i10, i11);
                return;
            }
            return;
        }
        z10 = z6;
        if (!qVar.O(i12 & 1, (74899 & i12) == 74898)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final void ConfirmationDialogContent(String str, String str2, String str3, ho.a aVar, String str4, ho.a aVar2, boolean z6, u2.m mVar, int i10, int i11) {
        String str5;
        int i12;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-135740264);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            str5 = str;
        } else if ((i10 & 6) == 0) {
            str5 = str;
            i12 = (qVar.f(str5) ? 4 : 2) | i10;
        } else {
            str5 = str;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= qVar.f(str2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= qVar.f(str3) ? RpcError.MAX_MESSAGE_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= qVar.h(aVar) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i10 & 24576) == 0) {
            i12 |= qVar.f(str4) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i10) == 0) {
            i12 |= qVar.h(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= qVar.g(z6) ? 1048576 : 524288;
        }
        if (qVar.O(i12 & 1, (599187 & i12) != 599186)) {
            String str6 = i13 != 0 ? null : str5;
            int i14 = i12 >> 6;
            ConfirmationDialogContent(str3, aVar, str4, aVar2, c3.k.d(-1798356987, true, new k(str6, str2, 1), qVar), z6, qVar, (i14 & 7168) | (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | ((i12 >> 3) & 458752));
            str5 = str6;
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new o0(str5, str2, str3, aVar, str4, aVar2, z6, i10, i11);
        }
    }
}
