package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.protobuf.c6;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.BluetoothButton;
import io.elevenlabs.domain.model.BluetoothButtonAction;
import io.elevenlabs.domain.model.PlayerActionButton;
import io.elevenlabs.domain.model.PlayerDisplayMode;
import io.elevenlabs.domain.model.PlayerFontFamily;
import io.elevenlabs.domain.model.PlayerPreferences;
import io.elevenlabs.domain.model.PlayerTheme;
import io.elevenlabs.domain.model.SkipDuration;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.domain.model.UserConfigRequest;
import io.elevenlabs.domain.services.PlayerPreferencesService;
import io.elevenlabs.domain.services.UserConfigService;
import io.elevenlabs.readerapp.core.MviViewModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\r¢\u0006\u0004\b!\u0010\u000fJ\u001d\u0010$\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\r¢\u0006\u0004\b*\u0010\u000fJ\u001d\u0010-\u001a\u00020\r2\u0006\u0010'\u001a\u00020&2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\r2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\r2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b3\u00102J\r\u00104\u001a\u00020\r¢\u0006\u0004\b4\u0010\u000fJ\u0018\u00108\u001a\u0002072\u0006\u00106\u001a\u000205H\u0082@¢\u0006\u0004\b8\u00109J\u0018\u0010<\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0082@¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010>R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010?R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010@¨\u0006A"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerPreferencesViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerPreferencesState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/UserConfigService;", "userConfigService", "Lio/elevenlabs/domain/services/PlayerPreferencesService;", "playerPreferencesService", "Lio/elevenlabs/domain/Analytics;", "analytics", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/UserConfigService;Lio/elevenlabs/domain/services/PlayerPreferencesService;Lio/elevenlabs/domain/Analytics;)V", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "onFontSelectClick", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "closeFontsDialog", "Lio/elevenlabs/domain/model/PlayerFontFamily;", "family", "onFontFamilyChanged", "(Lio/elevenlabs/domain/model/PlayerFontFamily;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "", "fontSize", "onFontSizeChanged", "(J)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lio/elevenlabs/domain/model/PlayerTheme;", "theme", "selectTheme", "(Lio/elevenlabs/domain/model/PlayerTheme;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lio/elevenlabs/domain/model/BluetoothButton;", "button", "onBluetoothButtonClick", "(Lio/elevenlabs/domain/model/BluetoothButton;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "closeActionSelector", "Lio/elevenlabs/domain/model/BluetoothButtonAction;", "action", "selectBluetoothAction", "(Lio/elevenlabs/domain/model/BluetoothButton;Lio/elevenlabs/domain/model/BluetoothButtonAction;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/InAppSkipDirection;", "direction", "onInAppSkipDurationButtonClick", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/InAppSkipDirection;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "closeInAppSkipDurationSelector", "Lio/elevenlabs/domain/model/SkipDuration;", "duration", "selectInAppSkipDuration", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/InAppSkipDirection;Lio/elevenlabs/domain/model/SkipDuration;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "", "enabled", "toggleAutoFullscreen", "(Z)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "toggleTapToShowControls", "reset", "Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;", "config", "Lsn/z;", "saveConfigAsync", "(Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/PlayerPreferences;", "preferences", "savePreferencesAsync", "(Lio/elevenlabs/domain/model/PlayerPreferences;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/services/UserConfigService;", "Lio/elevenlabs/domain/services/PlayerPreferencesService;", "Lio/elevenlabs/domain/Analytics;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerPreferencesViewModel extends MviViewModel<PlayerPreferencesState> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final PlayerPreferencesService playerPreferencesService;
    private final UserConfigService userConfigService;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$1", f = "PlayerPreferencesViewModel.kt", l = {52}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$1$1", f = "PlayerPreferencesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/elevenlabs/domain/model/UserConfig;", "config", "Lsn/z;", "<anonymous>", "(Lio/elevenlabs/domain/model/UserConfig;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C00401 extends yn.i implements ho.p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PlayerPreferencesViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00401(PlayerPreferencesViewModel playerPreferencesViewModel, wn.c<? super C00401> cVar) {
                super(2, cVar);
                this.this$0 = playerPreferencesViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final PlayerPreferencesState invokeSuspend$lambda$0(UserConfig userConfig, PlayerPreferencesState playerPreferencesState) {
                return PlayerPreferencesState.copy$default(playerPreferencesState, userConfig.getPlayer(), null, false, false, false, null, null, 122, null);
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                C00401 c00401 = new C00401(this.this$0, cVar);
                c00401.L$0 = obj;
                return c00401;
            }

            @Override // ho.p
            public final Object invoke(UserConfig userConfig, wn.c<? super sn.z> cVar) {
                return ((C00401) create(userConfig, cVar)).invokeSuspend(sn.z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                UserConfig userConfig = (UserConfig) this.L$0;
                if (this.label == 0) {
                    sn.a.g(obj);
                    this.this$0.queueStateUpdate(new e0(userConfig, 0));
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        public AnonymousClass1(wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                ir.i config = PlayerPreferencesViewModel.this.userConfigService.getConfig();
                C00401 c00401 = new C00401(PlayerPreferencesViewModel.this, null);
                this.label = 1;
                Object l4 = ir.r.l(config, c00401, this);
                xn.a aVar = xn.a.f37986a;
                if (l4 == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$2", f = "PlayerPreferencesViewModel.kt", l = {61}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends yn.i implements ho.p {
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$2$1", f = "PlayerPreferencesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/elevenlabs/domain/model/PlayerPreferences;", "preferences", "Lsn/z;", "<anonymous>", "(Lio/elevenlabs/domain/model/PlayerPreferences;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$2$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1 extends yn.i implements ho.p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PlayerPreferencesViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayerPreferencesViewModel playerPreferencesViewModel, wn.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.this$0 = playerPreferencesViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final PlayerPreferencesState invokeSuspend$lambda$0(PlayerPreferences playerPreferences, PlayerPreferencesState playerPreferencesState) {
                return PlayerPreferencesState.copy$default(playerPreferencesState, null, playerPreferences, false, false, false, null, null, 117, null);
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // ho.p
            public final Object invoke(PlayerPreferences playerPreferences, wn.c<? super sn.z> cVar) {
                return ((AnonymousClass1) create(playerPreferences, cVar)).invokeSuspend(sn.z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                PlayerPreferences playerPreferences = (PlayerPreferences) this.L$0;
                if (this.label == 0) {
                    sn.a.g(obj);
                    this.this$0.queueStateUpdate(new f0(playerPreferences, 0));
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        public AnonymousClass2(wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass2(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                ir.i preferences = PlayerPreferencesViewModel.this.playerPreferencesService.getPreferences();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PlayerPreferencesViewModel.this, null);
                this.label = 1;
                Object l4 = ir.r.l(preferences, anonymousClass1, this);
                xn.a aVar = xn.a.f37986a;
                if (l4 == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$3", f = "PlayerPreferencesViewModel.kt", l = {74}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends yn.i implements ho.p {
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$3$3", f = "PlayerPreferencesViewModel.kt", l = {74}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;", "it", "Lsn/z;", "<anonymous>", "(Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$3$3, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C00413 extends yn.i implements ho.p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PlayerPreferencesViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00413(PlayerPreferencesViewModel playerPreferencesViewModel, wn.c<? super C00413> cVar) {
                super(2, cVar);
                this.this$0 = playerPreferencesViewModel;
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                C00413 c00413 = new C00413(this.this$0, cVar);
                c00413.L$0 = obj;
                return c00413;
            }

            @Override // ho.p
            public final Object invoke(UserConfig.PlayerConfig playerConfig, wn.c<? super sn.z> cVar) {
                return ((C00413) create(playerConfig, cVar)).invokeSuspend(sn.z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                UserConfig.PlayerConfig playerConfig = (UserConfig.PlayerConfig) this.L$0;
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
                    PlayerPreferencesViewModel playerPreferencesViewModel = this.this$0;
                    this.L$0 = null;
                    this.label = 1;
                    Object saveConfigAsync = playerPreferencesViewModel.saveConfigAsync(playerConfig, this);
                    xn.a aVar = xn.a.f37986a;
                    if (saveConfigAsync == aVar) {
                        return aVar;
                    }
                }
                return sn.z.f31622a;
            }
        }

        public AnonymousClass3(wn.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass3(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass3) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                final ir.z1 stateFlow = PlayerPreferencesViewModel.this.getStateFlow();
                final ir.i iVar = new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$3$invokeSuspend$$inlined$filter$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$3$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$3$invokeSuspend$$inlined$filter$1$2", f = "PlayerPreferencesViewModel.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$3$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        /* loaded from: classes4.dex */
                        public static final class AnonymousClass1 extends yn.c {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(wn.c cVar) {
                                super(cVar);
                            }

                            @Override // yn.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(ir.j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                        @Override // ir.j
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, wn.c cVar) {
                            AnonymousClass1 anonymousClass1;
                            int i10;
                            if (cVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) cVar;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    i10 = anonymousClass1.label;
                                    if (i10 == 0) {
                                        if (i10 == 1) {
                                            sn.a.g(obj2);
                                        } else {
                                            c6.x("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                    } else {
                                        sn.a.g(obj2);
                                        ir.j jVar = this.$this_unsafeFlow;
                                        if (((PlayerPreferencesState) obj).getConfigHasChanged()) {
                                            anonymousClass1.L$0 = null;
                                            anonymousClass1.L$1 = null;
                                            anonymousClass1.L$2 = null;
                                            anonymousClass1.L$3 = null;
                                            anonymousClass1.I$0 = 0;
                                            anonymousClass1.label = 1;
                                            Object emit = jVar.emit(obj, anonymousClass1);
                                            xn.a aVar = xn.a.f37986a;
                                            if (emit == aVar) {
                                                return aVar;
                                            }
                                        }
                                    }
                                    return sn.z.f31622a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(cVar);
                            Object obj22 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                            }
                            return sn.z.f31622a;
                        }
                    }

                    @Override // ir.i
                    public Object collect(ir.j jVar, wn.c cVar) {
                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return sn.z.f31622a;
                    }
                };
                ir.i o6 = ir.r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$3$invokeSuspend$$inlined$mapNotNull$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$3$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$3$invokeSuspend$$inlined$mapNotNull$1$2", f = "PlayerPreferencesViewModel.kt", l = {52}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$3$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        /* loaded from: classes4.dex */
                        public static final class AnonymousClass1 extends yn.c {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            Object L$4;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(wn.c cVar) {
                                super(cVar);
                            }

                            @Override // yn.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(ir.j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                        @Override // ir.j
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, wn.c cVar) {
                            AnonymousClass1 anonymousClass1;
                            int i10;
                            if (cVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) cVar;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    i10 = anonymousClass1.label;
                                    if (i10 == 0) {
                                        if (i10 == 1) {
                                            sn.a.g(obj2);
                                        } else {
                                            c6.x("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                    } else {
                                        sn.a.g(obj2);
                                        ir.j jVar = this.$this_unsafeFlow;
                                        UserConfig.PlayerConfig playerConfig = ((PlayerPreferencesState) obj).getPlayerConfig();
                                        if (playerConfig != null) {
                                            anonymousClass1.L$0 = null;
                                            anonymousClass1.L$1 = null;
                                            anonymousClass1.L$2 = null;
                                            anonymousClass1.L$3 = null;
                                            anonymousClass1.L$4 = null;
                                            anonymousClass1.I$0 = 0;
                                            anonymousClass1.label = 1;
                                            Object emit = jVar.emit(playerConfig, anonymousClass1);
                                            xn.a aVar = xn.a.f37986a;
                                            if (emit == aVar) {
                                                return aVar;
                                            }
                                        }
                                    }
                                    return sn.z.f31622a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(cVar);
                            Object obj22 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                            }
                            return sn.z.f31622a;
                        }
                    }

                    @Override // ir.i
                    public Object collect(ir.j jVar, wn.c cVar) {
                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return sn.z.f31622a;
                    }
                });
                xq.a aVar = xq.b.f38124b;
                long N = fr.g0.N(xq.g.n(500, xq.d.MILLISECONDS));
                if (N >= 0) {
                    if (N != 0) {
                        o6 = new ir.m1(new ir.o(new a2.g(N, 6), o6, null));
                    }
                    C00413 c00413 = new C00413(PlayerPreferencesViewModel.this, null);
                    this.label = 1;
                    Object l4 = ir.r.l(o6, c00413, this);
                    xn.a aVar2 = xn.a.f37986a;
                    if (l4 == aVar2) {
                        return aVar2;
                    }
                } else {
                    c6.t("Debounce timeout should not be negative");
                    return null;
                }
            }
            return sn.z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$4", f = "PlayerPreferencesViewModel.kt", l = {83}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass4 extends yn.i implements ho.p {
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$4$3", f = "PlayerPreferencesViewModel.kt", l = {83}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/elevenlabs/domain/model/PlayerPreferences;", "it", "Lsn/z;", "<anonymous>", "(Lio/elevenlabs/domain/model/PlayerPreferences;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$4$3, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass3 extends yn.i implements ho.p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PlayerPreferencesViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(PlayerPreferencesViewModel playerPreferencesViewModel, wn.c<? super AnonymousClass3> cVar) {
                super(2, cVar);
                this.this$0 = playerPreferencesViewModel;
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, cVar);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // ho.p
            public final Object invoke(PlayerPreferences playerPreferences, wn.c<? super sn.z> cVar) {
                return ((AnonymousClass3) create(playerPreferences, cVar)).invokeSuspend(sn.z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                PlayerPreferences playerPreferences = (PlayerPreferences) this.L$0;
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
                    PlayerPreferencesViewModel playerPreferencesViewModel = this.this$0;
                    this.L$0 = null;
                    this.label = 1;
                    Object savePreferencesAsync = playerPreferencesViewModel.savePreferencesAsync(playerPreferences, this);
                    xn.a aVar = xn.a.f37986a;
                    if (savePreferencesAsync == aVar) {
                        return aVar;
                    }
                }
                return sn.z.f31622a;
            }
        }

        public AnonymousClass4(wn.c<? super AnonymousClass4> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass4(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass4) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                final ir.z1 stateFlow = PlayerPreferencesViewModel.this.getStateFlow();
                final ir.i iVar = new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$4$invokeSuspend$$inlined$filter$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$4$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$4$invokeSuspend$$inlined$filter$1$2", f = "PlayerPreferencesViewModel.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$4$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        /* loaded from: classes4.dex */
                        public static final class AnonymousClass1 extends yn.c {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(wn.c cVar) {
                                super(cVar);
                            }

                            @Override // yn.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(ir.j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                        @Override // ir.j
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, wn.c cVar) {
                            AnonymousClass1 anonymousClass1;
                            int i10;
                            if (cVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) cVar;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    i10 = anonymousClass1.label;
                                    if (i10 == 0) {
                                        if (i10 == 1) {
                                            sn.a.g(obj2);
                                        } else {
                                            c6.x("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                    } else {
                                        sn.a.g(obj2);
                                        ir.j jVar = this.$this_unsafeFlow;
                                        if (((PlayerPreferencesState) obj).getPreferencesHasChanged()) {
                                            anonymousClass1.L$0 = null;
                                            anonymousClass1.L$1 = null;
                                            anonymousClass1.L$2 = null;
                                            anonymousClass1.L$3 = null;
                                            anonymousClass1.I$0 = 0;
                                            anonymousClass1.label = 1;
                                            Object emit = jVar.emit(obj, anonymousClass1);
                                            xn.a aVar = xn.a.f37986a;
                                            if (emit == aVar) {
                                                return aVar;
                                            }
                                        }
                                    }
                                    return sn.z.f31622a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(cVar);
                            Object obj22 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                            }
                            return sn.z.f31622a;
                        }
                    }

                    @Override // ir.i
                    public Object collect(ir.j jVar, wn.c cVar) {
                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return sn.z.f31622a;
                    }
                };
                ir.i o6 = ir.r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$4$invokeSuspend$$inlined$mapNotNull$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$4$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$4$invokeSuspend$$inlined$mapNotNull$1$2", f = "PlayerPreferencesViewModel.kt", l = {52}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel$4$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        /* loaded from: classes4.dex */
                        public static final class AnonymousClass1 extends yn.c {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            Object L$4;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(wn.c cVar) {
                                super(cVar);
                            }

                            @Override // yn.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(ir.j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                        @Override // ir.j
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, wn.c cVar) {
                            AnonymousClass1 anonymousClass1;
                            int i10;
                            if (cVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) cVar;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    i10 = anonymousClass1.label;
                                    if (i10 == 0) {
                                        if (i10 == 1) {
                                            sn.a.g(obj2);
                                        } else {
                                            c6.x("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                    } else {
                                        sn.a.g(obj2);
                                        ir.j jVar = this.$this_unsafeFlow;
                                        PlayerPreferences playerPreferences = ((PlayerPreferencesState) obj).getPlayerPreferences();
                                        if (playerPreferences != null) {
                                            anonymousClass1.L$0 = null;
                                            anonymousClass1.L$1 = null;
                                            anonymousClass1.L$2 = null;
                                            anonymousClass1.L$3 = null;
                                            anonymousClass1.L$4 = null;
                                            anonymousClass1.I$0 = 0;
                                            anonymousClass1.label = 1;
                                            Object emit = jVar.emit(playerPreferences, anonymousClass1);
                                            xn.a aVar = xn.a.f37986a;
                                            if (emit == aVar) {
                                                return aVar;
                                            }
                                        }
                                    }
                                    return sn.z.f31622a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(cVar);
                            Object obj22 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                            }
                            return sn.z.f31622a;
                        }
                    }

                    @Override // ir.i
                    public Object collect(ir.j jVar, wn.c cVar) {
                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return sn.z.f31622a;
                    }
                });
                xq.a aVar = xq.b.f38124b;
                long N = fr.g0.N(xq.g.n(500, xq.d.MILLISECONDS));
                if (N >= 0) {
                    if (N != 0) {
                        o6 = new ir.m1(new ir.o(new a2.g(N, 6), o6, null));
                    }
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(PlayerPreferencesViewModel.this, null);
                    this.label = 1;
                    Object l4 = ir.r.l(o6, anonymousClass3, this);
                    xn.a aVar2 = xn.a.f37986a;
                    if (l4 == aVar2) {
                        return aVar2;
                    }
                } else {
                    c6.t("Debounce timeout should not be negative");
                    return null;
                }
            }
            return sn.z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BluetoothButton.values().length];
            try {
                iArr[BluetoothButton.NEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BluetoothButton.PREVIOUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BluetoothButton.FORWARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BluetoothButton.BACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InAppSkipDirection.values().length];
            try {
                iArr2[InAppSkipDirection.FORWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InAppSkipDirection.BACKWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PlayerPreferencesViewModel(DispatcherFactory dispatcherFactory, UserConfigService userConfigService, PlayerPreferencesService playerPreferencesService, Analytics analytics) {
        super(new PlayerPreferencesState(null, null, false, false, false, null, null, 127, null), dispatcherFactory, r3, 4, null);
        dispatcherFactory.getClass();
        userConfigService.getClass();
        playerPreferencesService.getClass();
        analytics.getClass();
        Logger logger = null;
        this.userConfigService = userConfigService;
        this.playerPreferencesService = playerPreferencesService;
        this.analytics = analytics;
        fr.g0.D(androidx.lifecycle.c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass1(null), 2);
        fr.g0.D(androidx.lifecycle.c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass2(null), 2);
        fr.g0.D(androidx.lifecycle.c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass3(null), 2);
        fr.g0.D(androidx.lifecycle.c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass4(null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerPreferencesState closeActionSelector$lambda$0(PlayerPreferencesState playerPreferencesState) {
        playerPreferencesState.getClass();
        return PlayerPreferencesState.copy$default(playerPreferencesState, null, null, false, false, false, null, null, 95, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerPreferencesState closeFontsDialog$lambda$0(PlayerPreferencesState playerPreferencesState) {
        playerPreferencesState.getClass();
        return PlayerPreferencesState.copy$default(playerPreferencesState, null, null, false, false, false, null, null, 111, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerPreferencesState closeInAppSkipDurationSelector$lambda$0(PlayerPreferencesState playerPreferencesState) {
        playerPreferencesState.getClass();
        return PlayerPreferencesState.copy$default(playerPreferencesState, null, null, false, false, false, null, null, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerPreferencesState onBluetoothButtonClick$lambda$0(BluetoothButton bluetoothButton, PlayerPreferencesState playerPreferencesState) {
        playerPreferencesState.getClass();
        return PlayerPreferencesState.copy$default(playerPreferencesState, null, null, false, false, false, bluetoothButton, null, 95, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerPreferencesState onFontFamilyChanged$lambda$0(PlayerPreferencesViewModel playerPreferencesViewModel, PlayerFontFamily playerFontFamily, PlayerPreferencesState playerPreferencesState) {
        UserConfig.PlayerConfig playerConfig;
        playerPreferencesState.getClass();
        playerPreferencesViewModel.analytics.log(new Analytics.Event.PlayerUpdatedFontFamily(playerFontFamily.name()));
        UserConfig.PlayerConfig playerConfig2 = playerPreferencesState.getPlayerConfig();
        if (playerConfig2 != null) {
            playerConfig = UserConfig.PlayerConfig.copy$default(playerConfig2, 0L, playerFontFamily, null, null, null, 29, null);
        } else {
            playerConfig = null;
        }
        return PlayerPreferencesState.copy$default(playerPreferencesState, playerConfig, null, true, false, false, null, null, 106, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerPreferencesState onFontSelectClick$lambda$0(PlayerPreferencesState playerPreferencesState) {
        playerPreferencesState.getClass();
        return PlayerPreferencesState.copy$default(playerPreferencesState, null, null, false, false, true, null, null, 111, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerPreferencesState onFontSizeChanged$lambda$0(PlayerPreferencesViewModel playerPreferencesViewModel, long j4, PlayerPreferencesState playerPreferencesState) {
        UserConfig.PlayerConfig playerConfig;
        playerPreferencesState.getClass();
        playerPreferencesViewModel.analytics.log(new Analytics.Event.PlayerUpdatedFontSize(j4));
        UserConfig.PlayerConfig playerConfig2 = playerPreferencesState.getPlayerConfig();
        if (playerConfig2 != null) {
            playerConfig = UserConfig.PlayerConfig.copy$default(playerConfig2, j4, null, null, null, null, 30, null);
        } else {
            playerConfig = null;
        }
        return PlayerPreferencesState.copy$default(playerPreferencesState, playerConfig, null, true, false, false, null, null, 122, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerPreferencesState onInAppSkipDurationButtonClick$lambda$0(InAppSkipDirection inAppSkipDirection, PlayerPreferencesState playerPreferencesState) {
        playerPreferencesState.getClass();
        return PlayerPreferencesState.copy$default(playerPreferencesState, null, null, false, false, false, null, inAppSkipDirection, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerPreferencesState reset$lambda$0(PlayerPreferencesViewModel playerPreferencesViewModel, PlayerPreferencesState playerPreferencesState) {
        playerPreferencesState.getClass();
        playerPreferencesViewModel.analytics.log(Analytics.Event.PlayerClickedResetPreferences.INSTANCE);
        return PlayerPreferencesState.copy$default(playerPreferencesState, new UserConfig.PlayerConfig(16L, PlayerFontFamily.LIBRE, PlayerTheme.SKY, PlayerActionButton.SLEEP_TIMER, PlayerDisplayMode.Text), new PlayerPreferences(null, null, null, null, null, null, false, false, 255, null), true, true, false, null, null, 112, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveConfigAsync(UserConfig.PlayerConfig playerConfig, wn.c<? super sn.z> cVar) {
        Object saveAsync = this.userConfigService.saveAsync(new UserConfigRequest(null, null, playerConfig.getFontFamily(), new Long(playerConfig.getFontSize()), playerConfig.getTheme(), playerConfig.getActionButton(), null, null, null, null, null, 1987, null), cVar);
        if (saveAsync == xn.a.f37986a) {
            return saveAsync;
        }
        return sn.z.f31622a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object savePreferencesAsync(PlayerPreferences playerPreferences, wn.c<? super sn.z> cVar) {
        Object updatePreferences = this.playerPreferencesService.updatePreferences(playerPreferences, cVar);
        if (updatePreferences == xn.a.f37986a) {
            return updatePreferences;
        }
        return sn.z.f31622a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerPreferencesState selectBluetoothAction$lambda$0(PlayerPreferencesViewModel playerPreferencesViewModel, BluetoothButton bluetoothButton, BluetoothButtonAction bluetoothButtonAction, PlayerPreferencesState playerPreferencesState) {
        Analytics.Event playerUpdatedNextMediaButton;
        PlayerPreferences playerPreferences;
        PlayerPreferences playerPreferences2;
        playerPreferencesState.getClass();
        Analytics analytics = playerPreferencesViewModel.analytics;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i10 = iArr[bluetoothButton.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        playerUpdatedNextMediaButton = new Analytics.Event.PlayerUpdatedBackwardSeekButton(bluetoothButtonAction.name());
                    } else {
                        c6.p();
                        return null;
                    }
                } else {
                    playerUpdatedNextMediaButton = new Analytics.Event.PlayerUpdatedForwardSeekButton(bluetoothButtonAction.name());
                }
            } else {
                playerUpdatedNextMediaButton = new Analytics.Event.PlayerUpdatedPreviousMediaButton(bluetoothButtonAction.name());
            }
        } else {
            playerUpdatedNextMediaButton = new Analytics.Event.PlayerUpdatedNextMediaButton(bluetoothButtonAction.name());
        }
        analytics.log(playerUpdatedNextMediaButton);
        int i11 = iArr[bluetoothButton.ordinal()];
        PlayerPreferences playerPreferences3 = null;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        PlayerPreferences playerPreferences4 = playerPreferencesState.getPlayerPreferences();
                        if (playerPreferences4 != null) {
                            playerPreferences3 = PlayerPreferences.copy$default(playerPreferences4, null, null, null, bluetoothButtonAction, null, null, false, false, 247, null);
                        }
                    } else {
                        c6.p();
                        return null;
                    }
                } else {
                    playerPreferences = null;
                    PlayerPreferences playerPreferences5 = playerPreferencesState.getPlayerPreferences();
                    if (playerPreferences5 != null) {
                        playerPreferences3 = PlayerPreferences.copy$default(playerPreferences5, null, null, bluetoothButtonAction, null, null, null, false, false, 251, null);
                    }
                    playerPreferences2 = playerPreferences;
                }
                playerPreferences2 = playerPreferences3;
            } else {
                playerPreferences = null;
                PlayerPreferences playerPreferences6 = playerPreferencesState.getPlayerPreferences();
                if (playerPreferences6 != null) {
                    playerPreferences3 = PlayerPreferences.copy$default(playerPreferences6, null, bluetoothButtonAction, null, null, null, null, false, false, 253, null);
                    playerPreferences2 = playerPreferences3;
                }
                playerPreferences2 = playerPreferences;
            }
        } else {
            playerPreferences = null;
            PlayerPreferences playerPreferences7 = playerPreferencesState.getPlayerPreferences();
            if (playerPreferences7 != null) {
                playerPreferences3 = PlayerPreferences.copy$default(playerPreferences7, bluetoothButtonAction, null, null, null, null, null, false, false, 254, null);
                playerPreferences2 = playerPreferences3;
            }
            playerPreferences2 = playerPreferences;
        }
        return PlayerPreferencesState.copy$default(playerPreferencesState, null, playerPreferences2, false, true, false, null, null, 117, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerPreferencesState selectInAppSkipDuration$lambda$0(PlayerPreferencesViewModel playerPreferencesViewModel, InAppSkipDirection inAppSkipDirection, SkipDuration skipDuration, PlayerPreferencesState playerPreferencesState) {
        Analytics.Event playerUpdatedInAppForwardSkipDuration;
        PlayerPreferences playerPreferences;
        playerPreferencesState.getClass();
        Analytics analytics = playerPreferencesViewModel.analytics;
        int[] iArr = WhenMappings.$EnumSwitchMapping$1;
        int i10 = iArr[inAppSkipDirection.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                playerUpdatedInAppForwardSkipDuration = new Analytics.Event.PlayerUpdatedInAppBackwardSkipDuration(skipDuration.getSeconds());
            } else {
                c6.p();
                return null;
            }
        } else {
            playerUpdatedInAppForwardSkipDuration = new Analytics.Event.PlayerUpdatedInAppForwardSkipDuration(skipDuration.getSeconds());
        }
        analytics.log(playerUpdatedInAppForwardSkipDuration);
        int i11 = iArr[inAppSkipDirection.ordinal()];
        PlayerPreferences playerPreferences2 = null;
        if (i11 != 1) {
            if (i11 == 2) {
                PlayerPreferences playerPreferences3 = playerPreferencesState.getPlayerPreferences();
                if (playerPreferences3 != null) {
                    playerPreferences2 = PlayerPreferences.copy$default(playerPreferences3, null, null, null, null, null, skipDuration, false, false, 223, null);
                }
            } else {
                c6.p();
                return null;
            }
        } else {
            PlayerPreferences playerPreferences4 = playerPreferencesState.getPlayerPreferences();
            if (playerPreferences4 != null) {
                playerPreferences2 = PlayerPreferences.copy$default(playerPreferences4, null, null, null, null, skipDuration, null, false, false, 239, null);
            } else {
                playerPreferences = null;
                return PlayerPreferencesState.copy$default(playerPreferencesState, null, playerPreferences, false, true, false, null, null, 117, null);
            }
        }
        playerPreferences = playerPreferences2;
        return PlayerPreferencesState.copy$default(playerPreferencesState, null, playerPreferences, false, true, false, null, null, 117, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerPreferencesState selectTheme$lambda$0(PlayerPreferencesViewModel playerPreferencesViewModel, PlayerTheme playerTheme, PlayerPreferencesState playerPreferencesState) {
        UserConfig.PlayerConfig playerConfig;
        playerPreferencesState.getClass();
        playerPreferencesViewModel.analytics.log(new Analytics.Event.PlayerUpdatedTheme(playerTheme.name()));
        UserConfig.PlayerConfig playerConfig2 = playerPreferencesState.getPlayerConfig();
        if (playerConfig2 != null) {
            playerConfig = UserConfig.PlayerConfig.copy$default(playerConfig2, 0L, null, playerTheme, null, null, 27, null);
        } else {
            playerConfig = null;
        }
        return PlayerPreferencesState.copy$default(playerPreferencesState, playerConfig, null, true, false, false, null, null, 122, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerPreferencesState toggleAutoFullscreen$lambda$0(PlayerPreferencesViewModel playerPreferencesViewModel, boolean z6, PlayerPreferencesState playerPreferencesState) {
        PlayerPreferences playerPreferences;
        playerPreferencesState.getClass();
        playerPreferencesViewModel.analytics.log(new Analytics.Event.PlayerUpdatedAutoFullscreen(z6));
        PlayerPreferences playerPreferences2 = playerPreferencesState.getPlayerPreferences();
        if (playerPreferences2 != null) {
            playerPreferences = PlayerPreferences.copy$default(playerPreferences2, null, null, null, null, null, null, z6, false, 191, null);
        } else {
            playerPreferences = null;
        }
        return PlayerPreferencesState.copy$default(playerPreferencesState, null, playerPreferences, false, true, false, null, null, 117, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerPreferencesState toggleTapToShowControls$lambda$0(PlayerPreferencesViewModel playerPreferencesViewModel, boolean z6, PlayerPreferencesState playerPreferencesState) {
        PlayerPreferences playerPreferences;
        playerPreferencesState.getClass();
        playerPreferencesViewModel.analytics.log(new Analytics.Event.PlayerUpdatedTapToShowControls(z6));
        PlayerPreferences playerPreferences2 = playerPreferencesState.getPlayerPreferences();
        if (playerPreferences2 != null) {
            playerPreferences = PlayerPreferences.copy$default(playerPreferences2, null, null, null, null, null, null, false, z6, 127, null);
        } else {
            playerPreferences = null;
        }
        return PlayerPreferencesState.copy$default(playerPreferencesState, null, playerPreferences, false, true, false, null, null, 117, null);
    }

    public final MviViewModel.StateUpdate closeActionSelector() {
        return queueStateUpdate(new m(6));
    }

    public final MviViewModel.StateUpdate closeFontsDialog() {
        return queueStateUpdate(new m(4));
    }

    public final MviViewModel.StateUpdate closeInAppSkipDurationSelector() {
        return queueStateUpdate(new m(3));
    }

    public final MviViewModel.StateUpdate onBluetoothButtonClick(BluetoothButton button) {
        button.getClass();
        return queueStateUpdate(new u1(button, 10));
    }

    public final MviViewModel.StateUpdate onFontFamilyChanged(PlayerFontFamily family) {
        family.getClass();
        return queueStateUpdate(new d2(this, family, 4));
    }

    public final MviViewModel.StateUpdate onFontSelectClick() {
        return queueStateUpdate(new m(5));
    }

    public final MviViewModel.StateUpdate onFontSizeChanged(long fontSize) {
        return queueStateUpdate(new f2(this, fontSize, 1));
    }

    public final MviViewModel.StateUpdate onInAppSkipDurationButtonClick(InAppSkipDirection direction) {
        direction.getClass();
        return queueStateUpdate(new u1(direction, 9));
    }

    public final MviViewModel.StateUpdate reset() {
        return queueStateUpdate(new r(this, 7));
    }

    public final MviViewModel.StateUpdate selectBluetoothAction(BluetoothButton button, BluetoothButtonAction action) {
        button.getClass();
        action.getClass();
        return queueStateUpdate(new a2.o0(this, button, action, 21));
    }

    public final MviViewModel.StateUpdate selectInAppSkipDuration(InAppSkipDirection direction, SkipDuration duration) {
        direction.getClass();
        duration.getClass();
        return queueStateUpdate(new a2.o0(this, direction, duration, 20));
    }

    public final MviViewModel.StateUpdate selectTheme(PlayerTheme theme) {
        theme.getClass();
        return queueStateUpdate(new d2(this, theme, 5));
    }

    public final MviViewModel.StateUpdate toggleAutoFullscreen(boolean enabled) {
        return queueStateUpdate(new d0(this, enabled, 1));
    }

    public final MviViewModel.StateUpdate toggleTapToShowControls(boolean enabled) {
        return queueStateUpdate(new d0(this, enabled, 0));
    }
}
