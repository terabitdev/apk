package io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa;

import a2.p2;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.lifecycle.v;
import androidx.room.b0;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.protobuf.c6;
import ec.d0;
import fr.g0;
import ho.l;
import i4.m2;
import io.elevenlabs.domain.model.Bookmark;
import io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem;
import io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingState;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.ChatInputKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.EditBookmarkSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsState;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import j1.e0;
import j1.e1;
import j1.f0;
import j1.l1;
import java.util.List;
import java.util.UUID;
import lc.o;
import mc.m;
import na.n;
import q2.d2;
import q2.t3;
import q2.u5;
import q2.v5;
import sn.z;
import ta.n1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14894a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14895b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14896c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14898e;

    public /* synthetic */ f(l lVar, ReadDetailsState readDetailsState, z0 z0Var, z0 z0Var2) {
        this.f14894a = 7;
        this.f14895b = lVar;
        this.f14896c = readDetailsState;
        this.f14898e = z0Var;
        this.f14897d = z0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ho.a
    public final Object invoke() {
        z MfaVerificationScreenUi$lambda$4$0$4$0;
        z BottomItem$lambda$2$0;
        n1 initItemsPagingData$lambda$0;
        z QuestionAgePage$lambda$2$1$0$0;
        z ChatInput$lambda$2$3$0;
        n1 initSubpagePagingData$lambda$0;
        z EditBookmarkDialogUI$lambda$5$1$0;
        z ReadDetailsScreenUi$lambda$23$0;
        z ReadDetailsScreenUi$lambda$24$0;
        pc.c cVar;
        int i10 = 1;
        int i11 = 0;
        v vVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (this.f14894a) {
            case 0:
                MfaVerificationScreenUi$lambda$4$0$4$0 = MfaVerificationScreenKt.MfaVerificationScreenUi$lambda$4$0$4$0((MfaVerificationState) this.f14896c, (m2) this.f14897d, (l) this.f14895b, (z0) this.f14898e);
                return MfaVerificationScreenUi$lambda$4$0$4$0;
            case 1:
                BottomItem$lambda$2$0 = BottomNavigationKt.BottomItem$lambda$2$0((String) this.f14896c, (BottomNavigationItem) this.f14897d, (l) this.f14895b, (n) this.f14898e);
                return BottomItem$lambda$2$0;
            case 2:
                initItemsPagingData$lambda$0 = ExploreCollectionViewModel.initItemsPagingData$lambda$0((ExploreCollectionViewModel) this.f14896c, (String) this.f14897d, (List) this.f14895b, (String) this.f14898e);
                return initItemsPagingData$lambda$0;
            case 3:
                QuestionAgePage$lambda$2$1$0$0 = OnboardingScreenKt.QuestionAgePage$lambda$2$1$0$0((d2) this.f14896c, (l) this.f14895b, (OnboardingState) this.f14897d, (ho.a) this.f14898e);
                return QuestionAgePage$lambda$2$1$0$0;
            case 4:
                ChatInput$lambda$2$3$0 = ChatInputKt.ChatInput$lambda$2$3$0((String) this.f14896c, (ho.a) this.f14895b, (m2) this.f14897d, (ho.a) this.f14898e);
                return ChatInput$lambda$2$3$0;
            case 5:
                initSubpagePagingData$lambda$0 = AuthorProfileViewModel.initSubpagePagingData$lambda$0((AuthorProfileViewModel) this.f14896c, (String) this.f14897d, (String) this.f14895b, (String) this.f14898e);
                return initSubpagePagingData$lambda$0;
            case 6:
                EditBookmarkDialogUI$lambda$5$1$0 = EditBookmarkSheetKt.EditBookmarkDialogUI$lambda$5$1$0((l) this.f14895b, (BottomSheetControl) this.f14896c, (Bookmark) this.f14897d, (z0) this.f14898e);
                return EditBookmarkDialogUI$lambda$5$1$0;
            case 7:
                ReadDetailsScreenUi$lambda$23$0 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$23$0((l) this.f14895b, (ReadDetailsState) this.f14896c, (z0) this.f14898e, (z0) this.f14897d);
                return ReadDetailsScreenUi$lambda$23$0;
            case 8:
                ReadDetailsScreenUi$lambda$24$0 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$24$0((l) this.f14895b, (ReadDetailsState) this.f14896c, (l) this.f14897d, (z0) this.f14898e);
                return ReadDetailsScreenUi$lambda$24$0;
            case 9:
                Float f10 = (Float) this.f14896c;
                f0 f0Var = (f0) this.f14897d;
                Float f11 = (Float) this.f14895b;
                e0 e0Var = (e0) this.f14898e;
                if (!f10.equals(f0Var.f18233a) || !f11.equals(f0Var.f18234b)) {
                    f0Var.f18233a = f10;
                    f0Var.f18234b = f11;
                    f0Var.f18236d = new l1(e0Var, j1.e.f18214j, f10, f11, null);
                    f0Var.Z.f18248b.setValue(Boolean.TRUE);
                    f0Var.f18237e = false;
                    f0Var.f18238f = true;
                }
                return z.f31622a;
            case 10:
                m mVar = (m) this.f14896c;
                UUID uuid = (UUID) this.f14897d;
                dc.m mVar2 = (dc.m) this.f14895b;
                Context context = (Context) this.f14898e;
                String uuid2 = uuid.toString();
                o c5 = mVar.f23128c.c(uuid2);
                if (c5 != null && !c5.f21674b.a()) {
                    ec.c cVar2 = mVar.f23127b;
                    synchronized (cVar2.f8418k) {
                        try {
                            dc.v.e().f(ec.c.f8407l, "Moving WorkSpec (" + uuid2 + ") to the foreground");
                            d0 d0Var = (d0) cVar2.f8414g.remove(uuid2);
                            if (d0Var != null) {
                                if (cVar2.f8408a == null) {
                                    PowerManager.WakeLock a10 = mc.j.a(cVar2.f8409b);
                                    cVar2.f8408a = a10;
                                    a10.acquire();
                                }
                                cVar2.f8413f.put(uuid2, d0Var);
                                Intent a11 = kc.a.a(cVar2.f8409b, x7.e.s(d0Var.f8424a), mVar2);
                                Context context2 = cVar2.f8409b;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    a7.a.n(context2, a11);
                                } else {
                                    context2.startService(a11);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    lc.i s10 = x7.e.s(c5);
                    String str = kc.a.f20468y0;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", mVar2.f7901a);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", mVar2.f7902b);
                    intent.putExtra("KEY_NOTIFICATION", mVar2.f7903c);
                    intent.putExtra("KEY_WORKSPEC_ID", s10.f21660a);
                    intent.putExtra("KEY_GENERATION", s10.f21661b);
                    context.startService(intent);
                } else {
                    c6.x("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                return null;
            case 11:
                u5 u5Var = (u5) this.f14896c;
                e1 e1Var = (e1) this.f14897d;
                e1 e1Var2 = (e1) this.f14895b;
                e1 e1Var3 = (e1) this.f14898e;
                u5Var.f27768e = e1Var;
                u5Var.f27769f = e1Var2;
                u5Var.f27766c = e1Var3;
                return z.f31622a;
            case 12:
                u5 u5Var2 = (u5) this.f14896c;
                fr.d0 d0Var2 = (fr.d0) this.f14897d;
                j1.d dVar = (j1.d) this.f14895b;
                ho.a aVar = (ho.a) this.f14898e;
                if (((v5) u5Var2.f27767d.f30816g.getValue()) == v5.f27805b) {
                    if (u5Var2.f27767d.d().f30828a.containsKey(v5.f27806c)) {
                        g0.D(d0Var2, null, null, new p2((Object) dVar, (wn.c) (objArr3 == true ? 1 : 0), 21), 3);
                        g0.D(d0Var2, null, null, new t3(u5Var2, objArr2 == true ? 1 : 0, i11), 3);
                        return z.f31622a;
                    }
                }
                g0.D(d0Var2, null, null, new t3(u5Var2, objArr == true ? 1 : 0, i10), 3).invokeOnCompletion(new b0(6, aVar));
                return z.f31622a;
            default:
                Context context3 = (Context) this.f14896c;
                ho.a aVar2 = (ho.a) this.f14897d;
                ho.a aVar3 = (ho.a) this.f14895b;
                androidx.lifecycle.b0 b0Var = (androidx.lifecycle.b0) this.f14898e;
                ad.h hVar = new ad.h(context3);
                hVar.f1788c = aVar2.invoke();
                if (aVar3 != null) {
                    cVar = (pc.c) aVar3.invoke();
                } else {
                    cVar = null;
                }
                hVar.f1790e = cVar;
                if (b0Var != null) {
                    vVar = b0Var.getLifecycle();
                }
                hVar.f1805u = vVar;
                return hVar.a();
        }
    }

    public /* synthetic */ f(int i10, l lVar, Object obj, Object obj2, z0 z0Var) {
        this.f14894a = i10;
        this.f14895b = lVar;
        this.f14896c = obj;
        this.f14897d = obj2;
        this.f14898e = z0Var;
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f14894a = i10;
        this.f14896c = obj;
        this.f14897d = obj2;
        this.f14895b = obj3;
        this.f14898e = obj4;
    }

    public /* synthetic */ f(Object obj, sn.d dVar, Object obj2, ho.a aVar, int i10) {
        this.f14894a = i10;
        this.f14896c = obj;
        this.f14895b = dVar;
        this.f14897d = obj2;
        this.f14898e = aVar;
    }
}
