package io.elevenlabs.readerapp;

import android.app.Application;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.os.StatFs;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.readerapp.core.MviViewModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/readerapp/LowDiskSpaceViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/LowDiskSpaceState;", "Landroid/app/Application;", SIPServerTransaction.CONTENT_TYPE_APPLICATION, "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "<init>", "(Landroid/app/Application;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/DispatcherFactory;)V", "", "readAvailableBytes", "(Landroid/app/Application;)Ljava/lang/Long;", "Lsn/z;", "dismiss", "()V", "Lio/elevenlabs/domain/Logger;", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class LowDiskSpaceViewModel extends MviViewModel<LowDiskSpaceState> {
    private static final long LOW_DISK_SPACE_THRESHOLD_BYTES = 524288000;
    private static final String TAG = "LowDiskSpaceViewModel";
    private final Logger logger;
    public static final int $stable = 8;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.LowDiskSpaceViewModel$1", f = "LowDiskSpaceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.LowDiskSpaceViewModel$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends yn.i implements p {
        final /* synthetic */ Application $application;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Application application, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$application = application;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(this.$application, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                sn.a.g(obj);
                Long readAvailableBytes = LowDiskSpaceViewModel.this.readAvailableBytes(this.$application);
                z zVar = z.f31622a;
                if (readAvailableBytes != null) {
                    long longValue = readAvailableBytes.longValue();
                    if (longValue < LowDiskSpaceViewModel.LOW_DISK_SPACE_THRESHOLD_BYTES) {
                        Logger.logWarning$default(LowDiskSpaceViewModel.this.logger, LowDiskSpaceViewModel.TAG, android.gov.nist.javax.sip.header.a.k("Low disk space detected (available=", longValue, " bytes, threshold=524288000 bytes)"), null, 4, null);
                        LowDiskSpaceViewModel.this.queueStateUpdate(new d(0));
                    }
                }
                return zVar;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LowDiskSpaceViewModel(Application application, Logger logger, DispatcherFactory dispatcherFactory) {
        super(new LowDiskSpaceState(false, 1, null), dispatcherFactory, null, 4, null);
        application.getClass();
        logger.getClass();
        dispatcherFactory.getClass();
        this.logger = logger;
        launch(dispatcherFactory.getIo(), new AnonymousClass1(application, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LowDiskSpaceState dismiss$lambda$0(LowDiskSpaceState lowDiskSpaceState) {
        lowDiskSpaceState.getClass();
        return lowDiskSpaceState.copy(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long readAvailableBytes(Application application) {
        try {
            return Long.valueOf(new StatFs(application.getFilesDir().getAbsolutePath()).getAvailableBytes());
        } catch (Throwable th) {
            this.logger.logWarning(TAG, "Failed to read disk space", th);
            return null;
        }
    }

    public final void dismiss() {
        queueStateUpdate(new d(2));
    }
}
