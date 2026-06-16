package io.elevenlabs.readerapp.ui.screens.authenticated.account.explore;

import androidx.lifecycle.c1;
import fr.g0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.KeyLabel;
import io.elevenlabs.domain.services.ReadsExploreService;
import io.elevenlabs.domain.services.UserConfigService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001c¨\u0006\u001e"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/account/explore/ExploreLanguageSettingScreenViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/account/explore/ExploreLanguageState;", "Lio/elevenlabs/domain/services/ReadsExploreService;", "readsExploreService", "Lio/elevenlabs/domain/services/UserConfigService;", "userConfigService", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "<init>", "(Lio/elevenlabs/domain/services/ReadsExploreService;Lio/elevenlabs/domain/services/UserConfigService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/DispatcherFactory;)V", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "loadLanguages", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lio/elevenlabs/domain/model/KeyLabel;", "language", "selectLanguage", "(Lio/elevenlabs/domain/model/KeyLabel;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lsn/z;", "retry", "()V", "Lio/elevenlabs/domain/services/ReadsExploreService;", "Lio/elevenlabs/domain/services/UserConfigService;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/Logger;", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ExploreLanguageSettingScreenViewModel extends MviViewModel<ExploreLanguageState> {
    private static final String TAG = "ExploreLanguageSettingVM";
    private final Logger logger;
    private final ReadsExploreService readsExploreService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final UserConfigService userConfigService;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreLanguageSettingScreenViewModel(ReadsExploreService readsExploreService, UserConfigService userConfigService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Logger logger, DispatcherFactory dispatcherFactory) {
        super(new ExploreLanguageState(false, null, null, null, 15, null), dispatcherFactory, logger);
        readsExploreService.getClass();
        userConfigService.getClass();
        resolveErrorMessageUseCase.getClass();
        logger.getClass();
        dispatcherFactory.getClass();
        this.readsExploreService = readsExploreService;
        this.userConfigService = userConfigService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.logger = logger;
        loadLanguages();
    }

    private final MviViewModel.StateUpdate loadLanguages() {
        return queueStateUpdate(new c(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExploreLanguageState loadLanguages$lambda$0(ExploreLanguageSettingScreenViewModel exploreLanguageSettingScreenViewModel, ExploreLanguageState exploreLanguageState) {
        exploreLanguageState.getClass();
        g0.D(c1.h(exploreLanguageSettingScreenViewModel), exploreLanguageSettingScreenViewModel.getDispatcherFactory().getIo(), null, new ExploreLanguageSettingScreenViewModel$loadLanguages$1$1(exploreLanguageSettingScreenViewModel, null), 2);
        return ExploreLanguageState.copy$default(exploreLanguageState, true, null, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExploreLanguageState selectLanguage$lambda$0(ExploreLanguageSettingScreenViewModel exploreLanguageSettingScreenViewModel, KeyLabel keyLabel, ExploreLanguageState exploreLanguageState) {
        exploreLanguageState.getClass();
        exploreLanguageSettingScreenViewModel.readsExploreService.setPersistedExploreLanguage(keyLabel.getKey());
        return ExploreLanguageState.copy$default(exploreLanguageState, false, null, null, keyLabel.getKey(), 7, null);
    }

    public final void retry() {
        loadLanguages();
    }

    public final MviViewModel.StateUpdate selectLanguage(KeyLabel language) {
        language.getClass();
        return queueStateUpdate(new h(this, language, 1));
    }
}
