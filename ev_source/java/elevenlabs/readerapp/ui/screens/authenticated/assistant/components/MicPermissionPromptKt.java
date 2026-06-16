package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components;

import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import e5.k;
import f4.f1;
import h4.e;
import h4.g;
import h4.h;
import i3.t;
import io.elevenlabs.readerapp.ui.components.d0;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.f;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonVariant;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.y2;
import r1.d;
import r1.j;
import r1.p;
import r1.p2;
import r1.w;
import r1.x;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u001aA\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onRequestPermission", "Li3/t;", "modifier", "", "isPermanentlyDenied", "onOpenSettings", "MicPermissionPrompt", "(Lho/a;Li3/t;ZLho/a;Lu2/m;II)V", "Preview_MicPermissionPrompt", "(Lu2/m;I)V", "Preview_MicPermissionPromptDenied", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class MicPermissionPromptKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MicPermissionPrompt(ho.a aVar, t tVar, boolean z6, ho.a aVar2, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        ho.a aVar3;
        int i17;
        boolean z11;
        t tVar3;
        boolean z12;
        ho.a aVar4;
        r1 r10;
        boolean z13;
        ho.a aVar5;
        int i18;
        int i19;
        ho.a aVar6;
        int i20;
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(1708471652);
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
        int i21 = i11 & 2;
        if (i21 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                z10 = z6;
                if (qVar.g(z10)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                i16 = i11 & 8;
                if (i16 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    aVar3 = aVar2;
                    if (qVar.h(aVar3)) {
                        i17 = 2048;
                    } else {
                        i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i12 |= i17;
                    if ((i12 & 1171) == 1170) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!qVar.O(i12 & 1, z11)) {
                        i3.q qVar2 = i3.q.f13017a;
                        if (i21 != 0) {
                            tVar2 = qVar2;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if (i16 != 0) {
                            Object L = qVar.L();
                            if (L == l.f33918a) {
                                L = new f(24);
                                qVar.h0(L);
                            }
                            aVar5 = (ho.a) L;
                        } else {
                            aVar5 = aVar3;
                        }
                        t d10 = p2.d(tVar2, 1.0f);
                        EchoTheme echoTheme = EchoTheme.INSTANCE;
                        int i22 = EchoTheme.$stable;
                        t G = d.G(d10, echoTheme.getSpacings(qVar, i22).getX5(), u.P, 2);
                        x a10 = w.a(j.f29232e, i3.d.C0, qVar, 54);
                        int hashCode = Long.hashCode(qVar.T);
                        o l4 = qVar.l();
                        t c5 = i3.a.c(G, qVar);
                        h.f11920i.getClass();
                        h4.f fVar = g.f11903b;
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(fVar);
                        } else {
                            qVar.k0();
                        }
                        e eVar = g.f11907f;
                        r.J(eVar, a10, qVar);
                        e eVar2 = g.f11906e;
                        r.J(eVar2, l4, qVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        e eVar3 = g.f11908g;
                        r.y(qVar, valueOf, eVar3);
                        h4.d dVar = g.f11909h;
                        r.F(dVar, qVar);
                        e eVar4 = g.f11905d;
                        r.J(eVar4, c5, qVar);
                        boolean z14 = z13;
                        t tVar4 = tVar2;
                        t h10 = n.h(p2.o(qVar2, 48), echoTheme.getColors(qVar, i22).getFill().getNonary(qVar, EchoThemeColors.Fill.$stable), echoTheme.getShapes(qVar, i22).getFull(qVar, EchoThemeShapes.$stable));
                        f1 d11 = p.d(i3.d.f13001e, false);
                        int hashCode2 = Long.hashCode(qVar.T);
                        o l7 = qVar.l();
                        t c10 = i3.a.c(h10, qVar);
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(fVar);
                        } else {
                            qVar.k0();
                        }
                        r.J(eVar, d11, qVar);
                        r.J(eVar2, l7, qVar);
                        defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
                        r.J(eVar4, c10, qVar);
                        y2.a(kd.a.M(R.drawable.mic_filled, qVar, 0), null, p2.o(qVar2, 24), echoTheme.getColors(qVar, i22).getIcon().getPrimary(qVar, EchoThemeColors.Icon.$stable), qVar, u3.c.$stable | 432, 0);
                        qVar.p(true);
                        d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i22).getX10()), qVar);
                        if (z14) {
                            i18 = io.elevenlabs.readerapp.R.string.assistant_mic_permission_denied_body;
                        } else {
                            i18 = io.elevenlabs.readerapp.R.string.assistant_mic_permission_body;
                        }
                        j7.d(kj.c.R(qVar, i18), null, echoTheme.getColors(qVar, i22).getText().getPrimary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, new k(3), 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i22).getBaseRegular500(qVar, EchoThemeTypography.$stable), qVar, 0, 0, 130042);
                        d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i22).getX8()), qVar);
                        t e10 = p2.e(qVar2, 1.0f);
                        if (z14) {
                            i19 = io.elevenlabs.readerapp.R.string.assistant_mic_permission_denied_button;
                        } else {
                            i19 = io.elevenlabs.readerapp.R.string.assistant_mic_permission_button;
                        }
                        String R = kj.c.R(qVar, i19);
                        FullWidthButtonVariant fullWidthButtonVariant = FullWidthButtonVariant.Primary;
                        if (z14) {
                            aVar6 = aVar5;
                        } else {
                            aVar6 = aVar;
                        }
                        FullWidthButtonKt.EchoThemeFullWidthButton(R, aVar6, e10, null, fullWidthButtonVariant, null, false, false, false, qVar, 24960, 488);
                        qVar = qVar;
                        qVar.p(true);
                        z12 = z14;
                        aVar4 = aVar5;
                        tVar3 = tVar4;
                    } else {
                        qVar.R();
                        tVar3 = tVar2;
                        z12 = z10;
                        aVar4 = aVar3;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new d0(aVar, tVar3, z12, aVar4, i10, i11, 1);
                        return;
                    }
                    return;
                }
                aVar3 = aVar2;
                if ((i12 & 1171) == 1170) {
                }
                if (!qVar.O(i12 & 1, z11)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            z10 = z6;
            i16 = i11 & 8;
            if (i16 != 0) {
            }
            aVar3 = aVar2;
            if ((i12 & 1171) == 1170) {
            }
            if (!qVar.O(i12 & 1, z11)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        z10 = z6;
        i16 = i11 & 8;
        if (i16 != 0) {
        }
        aVar3 = aVar2;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z MicPermissionPrompt$lambda$2(ho.a aVar, t tVar, boolean z6, ho.a aVar2, int i10, int i11, m mVar, int i12) {
        MicPermissionPrompt(aVar, tVar, z6, aVar2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_MicPermissionPrompt(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1966900032);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$MicPermissionPromptKt.INSTANCE.getLambda$2092385574$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e(i10, 25);
        }
    }

    public static final z Preview_MicPermissionPrompt$lambda$0(int i10, m mVar, int i11) {
        Preview_MicPermissionPrompt(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_MicPermissionPromptDenied(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(445559867);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$MicPermissionPromptKt.INSTANCE.getLambda$2085099553$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e(i10, 24);
        }
    }

    public static final z Preview_MicPermissionPromptDenied$lambda$0(int i10, m mVar, int i11) {
        Preview_MicPermissionPromptDenied(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
