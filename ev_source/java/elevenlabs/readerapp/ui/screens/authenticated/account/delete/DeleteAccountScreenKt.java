package io.elevenlabs.readerapp.ui.screens.authenticated.account.delete;

import a2.a2;
import androidx.lifecycle.o;
import androidx.lifecycle.r1;
import c3.k;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import h4.g;
import h4.h;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.User;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.x;
import io.elevenlabs.ui.components.BackButtonWithBackgroundKt;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.ButtonVariant;
import io.elevenlabs.ui.components.InputKt;
import io.elevenlabs.ui.components.InputState;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.rpc.RpcError;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import n3.v;
import pl.f;
import q2.j7;
import q2.k5;
import r1.c3;
import r1.j;
import r1.l2;
import r1.m1;
import r1.p2;
import r1.u0;
import r1.w;
import r1.z1;
import rd.c1;
import s4.y0;
import sn.z;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.z0;
import wq.n;
import wq.u;
import y4.d0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aG\u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072 \b\u0002\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onGoBack", "Lio/elevenlabs/readerapp/ui/screens/authenticated/account/delete/DeleteAccountViewModel;", "vm", "DeleteAccountScreen", "(Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/account/delete/DeleteAccountViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/account/delete/DeleteAccountState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "action", "DeleteAccountScreenUi", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/account/delete/DeleteAccountState;Lho/l;Lho/a;Lu2/m;II)V", "Preview_DeleteAccountScreen", "(Lu2/m;I)V", "", "enteredEmail", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DeleteAccountScreenKt {
    public static final void DeleteAccountScreen(ho.a aVar, DeleteAccountViewModel deleteAccountViewModel, m mVar, int i10, int i11) {
        int i12;
        boolean z6;
        ho.a aVar2;
        q qVar;
        q qVar2;
        q7.c cVar;
        boolean h10;
        Object L;
        int i13;
        int i14;
        aVar.getClass();
        q qVar3 = (q) mVar;
        qVar3.Z(1231319495);
        if ((i10 & 6) == 0) {
            if (qVar3.h(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0 && qVar3.h(deleteAccountViewModel)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar3.O(i12 & 1, z6)) {
            qVar3.T();
            if ((i10 & 1) != 0 && !qVar3.y()) {
                qVar3.R();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
            } else if ((i11 & 2) != 0) {
                r1 a10 = r7.a.a(qVar3);
                if (a10 != null) {
                    qVar2 = qVar3;
                    f o6 = tb.a.o(a10, qVar2);
                    if (a10 instanceof o) {
                        cVar = ((o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    deleteAccountViewModel = (DeleteAccountViewModel) gg.b.j0(e0.f20562a.b(DeleteAccountViewModel.class), a10, null, o6, cVar, qVar2);
                    i12 &= -113;
                    qVar2.q();
                    DeleteAccountState deleteAccountState = (DeleteAccountState) c1.m(deleteAccountViewModel.getStateFlow(), qVar2, 0).getValue();
                    h10 = qVar2.h(deleteAccountViewModel);
                    L = qVar2.L();
                    if (!h10 || L == l.f33918a) {
                        L = new d(deleteAccountViewModel, 1);
                        qVar2.h0(L);
                    }
                    q qVar4 = qVar2;
                    aVar2 = aVar;
                    DeleteAccountScreenUi(deleteAccountState, (ho.l) L, aVar2, qVar4, (i12 << 6) & 896, 0);
                    qVar = qVar4;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            qVar2 = qVar3;
            qVar2.q();
            DeleteAccountState deleteAccountState2 = (DeleteAccountState) c1.m(deleteAccountViewModel.getStateFlow(), qVar2, 0).getValue();
            h10 = qVar2.h(deleteAccountViewModel);
            L = qVar2.L();
            if (!h10) {
            }
            L = new d(deleteAccountViewModel, 1);
            qVar2.h0(L);
            q qVar42 = qVar2;
            aVar2 = aVar;
            DeleteAccountScreenUi(deleteAccountState2, (ho.l) L, aVar2, qVar42, (i12 << 6) & 896, 0);
            qVar = qVar42;
        } else {
            aVar2 = aVar;
            qVar = qVar3;
            qVar.R();
        }
        DeleteAccountViewModel deleteAccountViewModel2 = deleteAccountViewModel;
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new p(aVar2, deleteAccountViewModel2, i10, i11, 8);
        }
    }

    public static final z DeleteAccountScreen$lambda$0$0(DeleteAccountViewModel deleteAccountViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(deleteAccountViewModel);
        return z.f31622a;
    }

    public static final z DeleteAccountScreen$lambda$1(ho.a aVar, DeleteAccountViewModel deleteAccountViewModel, int i10, int i11, m mVar, int i12) {
        DeleteAccountScreen(aVar, deleteAccountViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DeleteAccountScreenUi(DeleteAccountState deleteAccountState, ho.l lVar, ho.a aVar, m mVar, int i10, int i11) {
        DeleteAccountState deleteAccountState2;
        int i12;
        ho.l lVar2;
        int i13;
        boolean z6;
        q qVar;
        ho.l lVar3;
        u2.r1 r10;
        boolean z10;
        ho.l lVar4;
        String str;
        boolean z11;
        int i14;
        int i15;
        deleteAccountState.getClass();
        aVar.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(291160393);
        if ((i10 & 6) == 0) {
            deleteAccountState2 = deleteAccountState;
            if (qVar2.h(deleteAccountState2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            deleteAccountState2 = deleteAccountState;
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            lVar2 = lVar;
            if (qVar2.h(lVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i10 & 384) == 0) {
                if (qVar2.h(aVar)) {
                    i14 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i12 & 1, z6)) {
                u2.e eVar = l.f33918a;
                if (i16 != 0) {
                    Object L = qVar2.L();
                    if (L == eVar) {
                        L = new e(3);
                        qVar2.h0(L);
                    }
                    lVar4 = (ho.l) L;
                    z10 = false;
                } else {
                    z10 = false;
                    lVar4 = lVar2;
                }
                User user = deleteAccountState2.getUser();
                String str2 = null;
                if (user != null) {
                    str = user.getEmail();
                } else {
                    str = null;
                }
                Object L2 = qVar2.L();
                if (L2 == eVar) {
                    L2 = r.A("");
                    qVar2.h0(L2);
                }
                z0 z0Var = (z0) L2;
                if (str != null) {
                    String obj = n.L0(DeleteAccountScreenUi$lambda$2(z0Var)).toString();
                    String email = deleteAccountState2.getUser().getEmail();
                    if (email != null) {
                        str2 = n.L0(email).toString();
                    }
                    if (u.O(obj, str2, true)) {
                        z11 = true;
                        qVar = qVar2;
                        k5.a(null, null, null, null, null, 0, 0L, 0L, null, k.d(-2005821096, true, new x(deleteAccountState2, aVar, str, lVar4, z11, z0Var), qVar2), qVar, 805306368, 511);
                        lVar3 = lVar4;
                    }
                }
                z11 = z10;
                qVar = qVar2;
                k5.a(null, null, null, null, null, 0, 0L, 0L, null, k.d(-2005821096, true, new x(deleteAccountState2, aVar, str, lVar4, z11, z0Var), qVar2), qVar, 805306368, 511);
                lVar3 = lVar4;
            } else {
                qVar = qVar2;
                qVar.R();
                lVar3 = lVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new fm.f(deleteAccountState, lVar3, aVar, i10, i11, 22);
                return;
            }
            return;
        }
        lVar2 = lVar;
        if ((i10 & 384) == 0) {
        }
        if ((i12 & 147) == 146) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z DeleteAccountScreenUi$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    private static final String DeleteAccountScreenUi$lambda$2(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final z DeleteAccountScreenUi$lambda$4(DeleteAccountState deleteAccountState, ho.a aVar, String str, final ho.l lVar, boolean z6, z0 z0Var, z1 z1Var, m mVar, int i10) {
        int i11;
        boolean z10;
        String str2;
        int i12;
        z1Var.getClass();
        if ((i10 & 6) == 0) {
            if (((q) mVar).f(z1Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        q qVar = (q) mVar;
        boolean O = qVar.O(i11 & 1, z10);
        z zVar = z.f31622a;
        if (O) {
            i3.q qVar2 = i3.q.f13017a;
            t o6 = r1.d.o(r1.d.D(p2.d(qVar2, 1.0f), z1Var), z1Var);
            r1.e eVar = j.f29230c;
            r1.x a10 = w.a(eVar, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c5 = i3.a.c(o6, qVar);
            h.f11920i.getClass();
            h4.f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar2 = g.f11907f;
            r.J(eVar2, a10, qVar);
            h4.e eVar3 = g.f11906e;
            r.J(eVar3, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar4 = g.f11908g;
            r.y(qVar, valueOf, eVar4);
            h4.d dVar = g.f11909h;
            r.F(dVar, qVar);
            h4.e eVar5 = g.f11905d;
            r.J(eVar5, c5, qVar);
            HeaderActionsKt.HeaderActions((t) null, (String) null, k.d(1766671847, true, new defpackage.b(deleteAccountState, aVar, 5), qVar), (ho.q) null, (i3.f) null, qVar, 384, 27);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            t y10 = l1.n.y(new m1(1.0f, true), l1.n.x(qVar), true, true);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            t G = r1.d.G(y10, elevenLabsTheme.getSpacings(qVar, i13).m2358getX6D9Ej5fM(), t2.u.P, 2);
            r1.x a11 = w.a(eVar, i3.d.C0, qVar, 48);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            t c10 = i3.a.c(G, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar2, a11, qVar);
            r.J(eVar3, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
            r.J(eVar5, c10, qVar);
            j7.d(kj.c.R(qVar, R.string.delete_account_title), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i13).getTitleLarge700Inter(), qVar, 0, 0, 131070);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i13).m2358getX6D9Ej5fM()), qVar);
            String R = kj.c.R(qVar, R.string.confirm_deletion);
            y0 bodyMedium500 = elevenLabsTheme.getTypo(qVar, i13).getBodyMedium500();
            ReaderColors readerColors = ReaderColors.INSTANCE;
            j7.d(R, p2.e(qVar2, 1.0f), readerColors.m2417getNeutral6000d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bodyMedium500, qVar, 48, 0, 131064);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i13).m2357getX5D9Ej5fM()), qVar);
            Object L = qVar.L();
            u2.e eVar6 = l.f33918a;
            if (L == eVar6) {
                L = new v();
                qVar.h0(L);
            }
            v vVar = (v) L;
            String DeleteAccountScreenUi$lambda$2 = DeleteAccountScreenUi$lambda$2(z0Var);
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            a2 a2Var = new a2(6, 0, 123);
            t j4 = n3.d.j(qVar2, vVar);
            Object L2 = qVar.L();
            if (L2 == eVar6) {
                L2 = new d(z0Var, 2);
                qVar.h0(L2);
            }
            InputKt.Input(DeleteAccountScreenUi$lambda$2, (ho.l) L2, j4, (t) null, (InputState) null, (String) null, (String) null, str2, (ho.p) null, a2Var, (a2.z1) null, (d0) null, false, 0, (m) qVar, 805306416, 0, 15736);
            Object L3 = qVar.L();
            if (L3 == eVar6) {
                L3 = new DeleteAccountScreenKt$DeleteAccountScreenUi$2$1$2$2$1(vVar, null);
                qVar.h0(L3);
            }
            r.f((ho.p) L3, zVar, qVar);
            i.C(elevenLabsTheme, qVar, i13, qVar2, qVar);
            j7.d(kj.c.R(qVar, R.string.deletion_is_permanent), p2.e(qVar2, 1.0f), readerColors.m2417getNeutral6000d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i13).getBodyMedium500(), qVar, 48, 0, 131064);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i13).m2358getX6D9Ej5fM()), qVar);
            t e10 = p2.e(qVar2, 1.0f);
            String R2 = kj.c.R(qVar, R.string.settings_delete_account);
            ButtonVariant buttonVariant = ButtonVariant.DangerConfirm;
            boolean isDeleteInProgress = deleteAccountState.isDeleteInProgress();
            ButtonSize buttonSize = ButtonSize.Large;
            boolean f10 = qVar.f(lVar);
            Object L4 = qVar.L();
            if (f10 || L4 == eVar6) {
                L4 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.delete.c
                    @Override // ho.a
                    public final Object invoke() {
                        z DeleteAccountScreenUi$lambda$4$0$1$3$0;
                        DeleteAccountScreenUi$lambda$4$0$1$3$0 = DeleteAccountScreenKt.DeleteAccountScreenUi$lambda$4$0$1$3$0(ho.l.this);
                        return DeleteAccountScreenUi$lambda$4$0$1$3$0;
                    }
                };
                qVar.h0(L4);
            }
            ButtonKt.Button(R2, (ho.a) L4, e10, buttonSize, buttonVariant, null, null, isDeleteInProgress, z6, false, qVar, 28032, 608);
            WeakHashMap weakHashMap = c3.f29142x;
            r1.d.g(r1.d.N(u0.e(qVar).f29154l), qVar);
            qVar.p(true);
            qVar.p(true);
            return zVar;
        }
        qVar.R();
        return zVar;
    }

    public static final z DeleteAccountScreenUi$lambda$4$0$0(DeleteAccountState deleteAccountState, ho.a aVar, l2 l2Var, m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean h10 = qVar.h(deleteAccountState) | qVar.f(aVar);
            Object L = qVar.L();
            if (h10 || L == l.f33918a) {
                L = new a2.q(deleteAccountState, aVar, 17);
                qVar.h0(L);
            }
            BackButtonWithBackgroundKt.BackButtonWithBackground((ho.a) L, t2.u.P, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z DeleteAccountScreenUi$lambda$4$0$0$0$0(DeleteAccountState deleteAccountState, ho.a aVar) {
        if (!deleteAccountState.isDeleteInProgress()) {
            aVar.invoke();
        }
        return z.f31622a;
    }

    public static final z DeleteAccountScreenUi$lambda$4$0$1$1$0(z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return z.f31622a;
    }

    public static final z DeleteAccountScreenUi$lambda$4$0$1$3$0(ho.l lVar) {
        lVar.invoke(new e(2));
        return z.f31622a;
    }

    public static final z DeleteAccountScreenUi$lambda$4$0$1$3$0$0(DeleteAccountViewModel deleteAccountViewModel) {
        deleteAccountViewModel.getClass();
        deleteAccountViewModel.deleteAccount();
        return z.f31622a;
    }

    public static final z DeleteAccountScreenUi$lambda$5(DeleteAccountState deleteAccountState, ho.l lVar, ho.a aVar, int i10, int i11, m mVar, int i12) {
        DeleteAccountScreenUi(deleteAccountState, lVar, aVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_DeleteAccountScreen(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(321361126);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            DeleteAccountState deleteAccountState = new DeleteAccountState(new User("abc", "test@elevenlabs.io", null, null), false);
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new Object();
                qVar.h0(L);
            }
            DeleteAccountScreenUi(deleteAccountState, null, (ho.a) L, qVar, 384, 2);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.c1(i10, 27);
        }
    }

    public static final z Preview_DeleteAccountScreen$lambda$1(int i10, m mVar, int i11) {
        Preview_DeleteAccountScreen(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
