package io.elevenlabs.readerapp.ui.screens.authenticated.home.elements;

import androidx.lifecycle.c1;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.p;
import io.elevenlabs.data.database.entities.reads.h;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.UserConfigService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import ir.r;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/home/elements/DailyStreakSettingsViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/home/elements/DailyStreakSettingsState;", "dispatcherFactory", "Lio/elevenlabs/domain/DispatcherFactory;", "userConfigService", "Lio/elevenlabs/domain/services/UserConfigService;", "toastService", "Lio/elevenlabs/domain/services/ToastService;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "analytics", "Lio/elevenlabs/domain/Analytics;", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/UserConfigService;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/Analytics;)V", "save", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "goalMinutes", "", "(Ljava/lang/Long;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "onClosed", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DailyStreakSettingsViewModel extends MviViewModel<DailyStreakSettingsState> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final ToastService toastService;
    private final UserConfigService userConfigService;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.elements.DailyStreakSettingsViewModel$1", f = "DailyStreakSettingsScreen.kt", l = {94}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.elements.DailyStreakSettingsViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends i implements p {
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.home.elements.DailyStreakSettingsViewModel$1$1", f = "DailyStreakSettingsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/elevenlabs/domain/model/UserConfig;", "it", "Lsn/z;", "<anonymous>", "(Lio/elevenlabs/domain/model/UserConfig;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.home.elements.DailyStreakSettingsViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C00391 extends i implements p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DailyStreakSettingsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00391(DailyStreakSettingsViewModel dailyStreakSettingsViewModel, wn.c<? super C00391> cVar) {
                super(2, cVar);
                this.this$0 = dailyStreakSettingsViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final DailyStreakSettingsState invokeSuspend$lambda$0(UserConfig userConfig, DailyStreakSettingsState dailyStreakSettingsState) {
                return DailyStreakSettingsState.copy$default(dailyStreakSettingsState, userConfig.getDailyStreakMinutes(), false, false, 6, null);
            }

            @Override // yn.a
            public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                C00391 c00391 = new C00391(this.this$0, cVar);
                c00391.L$0 = obj;
                return c00391;
            }

            @Override // ho.p
            public final Object invoke(UserConfig userConfig, wn.c<? super z> cVar) {
                return ((C00391) create(userConfig, cVar)).invokeSuspend(z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                UserConfig userConfig = (UserConfig) this.L$0;
                if (this.label == 0) {
                    sn.a.g(obj);
                    this.this$0.queueStateUpdate(new c(userConfig, 0));
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        public AnonymousClass1(wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
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
                ir.i config = DailyStreakSettingsViewModel.this.userConfigService.getConfig();
                C00391 c00391 = new C00391(DailyStreakSettingsViewModel.this, null);
                this.label = 1;
                Object l4 = r.l(config, c00391, this);
                xn.a aVar = xn.a.f37986a;
                if (l4 == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DailyStreakSettingsViewModel(DispatcherFactory dispatcherFactory, UserConfigService userConfigService, ToastService toastService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Analytics analytics) {
        super(new DailyStreakSettingsState(0L, false, false, 7, null), dispatcherFactory, r3, 4, null);
        dispatcherFactory.getClass();
        userConfigService.getClass();
        toastService.getClass();
        resolveErrorMessageUseCase.getClass();
        analytics.getClass();
        Logger logger = null;
        this.userConfigService = userConfigService;
        this.toastService = toastService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.analytics = analytics;
        g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass1(null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DailyStreakSettingsState onClosed$lambda$0(DailyStreakSettingsState dailyStreakSettingsState) {
        dailyStreakSettingsState.getClass();
        return DailyStreakSettingsState.copy$default(dailyStreakSettingsState, 0L, false, false, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DailyStreakSettingsState save$lambda$0(DailyStreakSettingsViewModel dailyStreakSettingsViewModel, Long l4, DailyStreakSettingsState dailyStreakSettingsState) {
        dailyStreakSettingsState.getClass();
        dailyStreakSettingsViewModel.analytics.log(Analytics.Event.HomeSavedListeningGoal.INSTANCE);
        if (dailyStreakSettingsState.isLoading() || l4 == null) {
            return dailyStreakSettingsState;
        }
        g0.D(c1.h(dailyStreakSettingsViewModel), dailyStreakSettingsViewModel.getDispatcherFactory().getDefault(), null, new DailyStreakSettingsViewModel$save$1$1(dailyStreakSettingsViewModel, l4, null), 2);
        return DailyStreakSettingsState.copy$default(dailyStreakSettingsState, 0L, true, false, 5, null);
    }

    public final MviViewModel.StateUpdate onClosed() {
        return queueStateUpdate(new d(3));
    }

    public final MviViewModel.StateUpdate save(Long goalMinutes) {
        return queueStateUpdate(new h(this, goalMinutes, 8));
    }
}
