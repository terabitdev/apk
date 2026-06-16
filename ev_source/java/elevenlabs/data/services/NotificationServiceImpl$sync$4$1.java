package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import com.google.protobuf.c6;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.NotificationServiceImpl$sync$4$1", f = "NotificationServiceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lkotlin/jvm/internal/EnhancedNullability;", "Landroid/content/SharedPreferences;"}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class NotificationServiceImpl$sync$4$1 extends yn.i implements p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationServiceImpl$sync$4$1(NotificationServiceImpl notificationServiceImpl, wn.c<? super NotificationServiceImpl$sync$4$1> cVar) {
        super(2, cVar);
        this.this$0 = notificationServiceImpl;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        NotificationServiceImpl$sync$4$1 notificationServiceImpl$sync$4$1 = new NotificationServiceImpl$sync$4$1(this.this$0, cVar);
        notificationServiceImpl$sync$4$1.L$0 = obj;
        return notificationServiceImpl$sync$4$1;
    }

    @Override // ho.p
    public final Object invoke(SharedPreferences sharedPreferences, wn.c<? super String> cVar) {
        return ((NotificationServiceImpl$sync$4$1) create(sharedPreferences, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        String str;
        SharedPreferences sharedPreferences = (SharedPreferences) this.L$0;
        if (this.label == 0) {
            sn.a.g(obj);
            str = this.this$0.prefNotificationTokenToSync;
            return sharedPreferences.getString(str, null);
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
