package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4;

import com.google.protobuf.c6;
import fr.d0;
import kotlin.Metadata;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeScreenV4Kt$HomeScreenV4$4$1", f = "HomeScreenV4.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class HomeScreenV4Kt$HomeScreenV4$4$1 extends yn.i implements ho.p {
    final /* synthetic */ j.j $notificationPermissionLauncher;
    final /* synthetic */ z0 $shouldRequestPermission$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenV4Kt$HomeScreenV4$4$1(j.j jVar, z0 z0Var, wn.c<? super HomeScreenV4Kt$HomeScreenV4$4$1> cVar) {
        super(2, cVar);
        this.$notificationPermissionLauncher = jVar;
        this.$shouldRequestPermission$delegate = z0Var;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new HomeScreenV4Kt$HomeScreenV4$4$1(this.$notificationPermissionLauncher, this.$shouldRequestPermission$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((HomeScreenV4Kt$HomeScreenV4$4$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            HomeScreenV4Kt.HomeScreenV4$lambda$4(this.$shouldRequestPermission$delegate, false);
            this.$notificationPermissionLauncher.a(new String[]{"android.permission.POST_NOTIFICATIONS"});
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
