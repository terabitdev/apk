package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3;

import android.os.Build;
import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.services.RuntimePermissionsService;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3$onNotificationPermissionResult$1", f = "HomeViewModelV3.kt", l = {253, RpcError.MAX_MESSAGE_BYTES}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class HomeViewModelV3$onNotificationPermissionResult$1 extends yn.i implements ho.p {
    final /* synthetic */ boolean $granted;
    Object L$0;
    int label;
    final /* synthetic */ HomeViewModelV3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModelV3$onNotificationPermissionResult$1(HomeViewModelV3 homeViewModelV3, boolean z6, wn.c<? super HomeViewModelV3$onNotificationPermissionResult$1> cVar) {
        super(2, cVar);
        this.this$0 = homeViewModelV3;
        this.$granted = z6;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new HomeViewModelV3$onNotificationPermissionResult$1(this.this$0, this.$granted, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((HomeViewModelV3$onNotificationPermissionResult$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (r5.askedForPermission(r0, r4) == r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
    
        if (r5 == r3) goto L23;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Analytics.Event event;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$0;
            sn.a.g(obj);
            if (!((Boolean) obj).booleanValue()) {
                this.this$0.getAnalytics().log(Analytics.Event.NotificationsDisplayedAllowDialog.INSTANCE);
                Analytics analytics = this.this$0.getAnalytics();
                if (this.$granted) {
                    event = Analytics.Event.NotificationsAllowedNotifications.INSTANCE;
                } else {
                    event = Analytics.Event.NotificationsRejectedNotifications.INSTANCE;
                }
                analytics.log(event);
                RuntimePermissionsService runtimePermissionsService = this.this$0.getRuntimePermissionsService();
                this.L$0 = null;
                this.label = 2;
            }
            return z.f31622a;
        }
        sn.a.g(obj);
        if (Build.VERSION.SDK_INT >= 33) {
            RuntimePermissionsService runtimePermissionsService2 = this.this$0.getRuntimePermissionsService();
            str = "android.permission.POST_NOTIFICATIONS";
            this.L$0 = "android.permission.POST_NOTIFICATIONS";
            this.label = 1;
            obj = runtimePermissionsService2.hasAskedForPermissionBefore("android.permission.POST_NOTIFICATIONS", this);
        }
        return z.f31622a;
    }
}
