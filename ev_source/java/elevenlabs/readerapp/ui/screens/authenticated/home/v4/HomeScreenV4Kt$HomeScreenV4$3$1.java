package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4;

import android.os.Build;
import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.services.RuntimePermissionsService;
import kotlin.Metadata;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeScreenV4Kt$HomeScreenV4$3$1", f = "HomeScreenV4.kt", l = {129}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class HomeScreenV4Kt$HomeScreenV4$3$1 extends yn.i implements ho.p {
    final /* synthetic */ z0 $hasCheckedPermission$delegate;
    final /* synthetic */ z0 $shouldRequestPermission$delegate;
    final /* synthetic */ HomeViewModelV4 $vm;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenV4Kt$HomeScreenV4$3$1(HomeViewModelV4 homeViewModelV4, z0 z0Var, z0 z0Var2, wn.c<? super HomeScreenV4Kt$HomeScreenV4$3$1> cVar) {
        super(2, cVar);
        this.$vm = homeViewModelV4;
        this.$hasCheckedPermission$delegate = z0Var;
        this.$shouldRequestPermission$delegate = z0Var2;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new HomeScreenV4Kt$HomeScreenV4$3$1(this.$vm, this.$hasCheckedPermission$delegate, this.$shouldRequestPermission$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((HomeScreenV4Kt$HomeScreenV4$3$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        boolean HomeScreenV4$lambda$6;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            HomeScreenV4$lambda$6 = HomeScreenV4Kt.HomeScreenV4$lambda$6(this.$hasCheckedPermission$delegate);
            if (!HomeScreenV4$lambda$6) {
                HomeScreenV4Kt.HomeScreenV4$lambda$7(this.$hasCheckedPermission$delegate, true);
                if (Build.VERSION.SDK_INT >= 33) {
                    RuntimePermissionsService runtimePermissionsService = this.$vm.getRuntimePermissionsService();
                    this.L$0 = null;
                    this.label = 1;
                    obj = runtimePermissionsService.hasAskedForPermissionBefore("android.permission.POST_NOTIFICATIONS", this);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            }
            return z.f31622a;
        }
        if (!((Boolean) obj).booleanValue()) {
            HomeScreenV4Kt.HomeScreenV4$lambda$4(this.$shouldRequestPermission$delegate, true);
        }
        return z.f31622a;
    }
}
