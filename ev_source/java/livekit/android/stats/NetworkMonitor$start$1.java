package io.livekit.android.stats;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import com.google.protobuf.c6;
import et.d;
import fr.d0;
import fr.g0;
import ho.p;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.c0;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.stats.NetworkMonitor$start$1", f = "NetworkMonitor.kt", l = {45}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NetworkMonitor$start$1 extends i implements p {
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ NetworkMonitor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkMonitor$start$1(NetworkMonitor networkMonitor, c<? super NetworkMonitor$start$1> cVar) {
        super(2, cVar);
        this.this$0 = networkMonitor;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        NetworkMonitor$start$1 networkMonitor$start$1 = new NetworkMonitor$start$1(this.this$0, cVar);
        networkMonitor$start$1.L$0 = obj;
        return networkMonitor$start$1;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((NetworkMonitor$start$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        Context context2;
        int i10;
        long uidTxBytes;
        d0 d0Var;
        c0 c0Var;
        String convertBytesToReadableString;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                uidTxBytes = this.J$0;
                i10 = this.I$0;
                c0 c0Var2 = (c0) this.L$1;
                d0Var = (d0) this.L$0;
                a.g(obj);
                c0Var = c0Var2;
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            a.g(obj);
            d0 d0Var2 = (d0) this.L$0;
            context = this.this$0.context;
            PackageManager packageManager = context.getPackageManager();
            context2 = this.this$0.context;
            i10 = packageManager.getApplicationInfo(context2.getPackageName(), 0).uid;
            uidTxBytes = TrafficStats.getUidTxBytes(i10);
            d0Var = d0Var2;
            c0Var = new Object();
        }
        while (g0.y(d0Var)) {
            long uidTxBytes2 = TrafficStats.getUidTxBytes(i10);
            long j4 = 2;
            c0Var.f20558a = ((uidTxBytes2 - uidTxBytes) / j4) + (c0Var.f20558a / j4);
            LKLog.Companion companion = LKLog.INSTANCE;
            NetworkMonitor networkMonitor = this.this$0;
            if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                StringBuilder sb = new StringBuilder("send rate: ");
                convertBytesToReadableString = networkMonitor.convertBytesToReadableString(c0Var.f20558a);
                sb.append(convertBytesToReadableString);
                d.e(null, sb.toString(), new Object[0]);
            }
            this.L$0 = d0Var;
            this.L$1 = c0Var;
            this.I$0 = i10;
            this.J$0 = uidTxBytes2;
            this.label = 1;
            Object m10 = g0.m(1000L, this);
            xn.a aVar = xn.a.f37986a;
            if (m10 == aVar) {
                return aVar;
            }
            uidTxBytes = uidTxBytes2;
        }
        return z.f31622a;
    }
}
