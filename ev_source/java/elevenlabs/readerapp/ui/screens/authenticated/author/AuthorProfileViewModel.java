package io.elevenlabs.readerapp.ui.screens.authenticated.author;

import a7.u;
import androidx.lifecycle.c1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.c6;
import fr.g0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.AuthorActionsSection;
import io.elevenlabs.domain.model.AuthorProfile;
import io.elevenlabs.domain.model.AuthorProfilePage;
import io.elevenlabs.domain.model.AuthorProfileSection;
import io.elevenlabs.domain.services.AuthorService;
import io.elevenlabs.domain.services.NotificationPermissionService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.core.router.d0;
import io.elevenlabs.readerapp.paging.AuthorSubpagePagingSource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import ta.e0;
import ta.n1;
import ta.w0;
import ta.z0;
import tn.a0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010!\u001a\u00020 2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00152\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b'\u0010\u0017J\r\u0010(\u001a\u00020\u0015¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00152\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u001d\u0010/\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020 ¢\u0006\u0004\b1\u00102R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00105R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00106R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00107R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00108R$\u0010<\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001d\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:098F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/author/AuthorProfileViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/author/AuthorProfileState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/AuthorService;", "authorService", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/services/NotificationPermissionService;", "notificationPermissionService", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/AuthorService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/StringProvider;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/services/NotificationPermissionService;)V", "", "authorId", "Lsn/z;", "doInit", "(Ljava/lang/String;)V", "subpageId", "sortKey", "initSubpagePagingData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lio/elevenlabs/domain/model/AsyncCallResult;", "result", "", "wasFollowing", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "handleFollowResult", "(Lio/elevenlabs/domain/model/AsyncCallResult;Z)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lio/elevenlabs/domain/model/AuthorProfile;", "author", "showAuthorFollowUnfollowSuccessToast", "(Lio/elevenlabs/domain/model/AuthorProfile;Z)V", "init", "onRetry", "()V", "", FirebaseAnalytics.Param.INDEX, "selectTab", "(I)V", "newSortKey", "onSortChange", "(Ljava/lang/String;Ljava/lang/String;)V", "onFollowToggle", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lio/elevenlabs/domain/services/AuthorService;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/services/ToastService;", "Lio/elevenlabs/domain/StringProvider;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/services/NotificationPermissionService;", "Lir/i;", "Lta/z0;", "Lio/elevenlabs/domain/model/AuthorProfileSection;", "_subpagePagingData", "Lir/i;", "getSubpagePagingData", "()Lir/i;", "subpagePagingData", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AuthorProfileViewModel extends MviViewModel<AuthorProfileState> {
    public static final int $stable = 8;
    private ir.i _subpagePagingData;
    private final AuthorService authorService;
    private final Logger logger;
    private final NotificationPermissionService notificationPermissionService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final StringProvider stringProvider;
    private final ToastService toastService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorProfileViewModel(DispatcherFactory dispatcherFactory, AuthorService authorService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, ToastService toastService, StringProvider stringProvider, Logger logger, NotificationPermissionService notificationPermissionService) {
        super(new AuthorProfileState(null, null, false, false, null, null, null, 127, null), dispatcherFactory, logger);
        dispatcherFactory.getClass();
        authorService.getClass();
        resolveErrorMessageUseCase.getClass();
        toastService.getClass();
        stringProvider.getClass();
        logger.getClass();
        notificationPermissionService.getClass();
        this.authorService = authorService;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.toastService = toastService;
        this.stringProvider = stringProvider;
        this.logger = logger;
        this.notificationPermissionService = notificationPermissionService;
    }

    private final void doInit(String authorId) {
        queueStateUpdate(new n(authorId, 1));
        g0.D(c1.h(this), null, null, new AuthorProfileViewModel$doInit$2(this, authorId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AuthorProfileState doInit$lambda$0(String str, AuthorProfileState authorProfileState) {
        authorProfileState.getClass();
        return AuthorProfileState.copy$default(authorProfileState, str, null, true, false, null, null, null, 72, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MviViewModel.StateUpdate handleFollowResult(AsyncCallResult<z> result, boolean wasFollowing) {
        return queueStateUpdate(new io.elevenlabs.readerapp.ui.components.explore.j(this, result, wasFollowing));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AuthorProfileState handleFollowResult$lambda$0(AsyncCallResult asyncCallResult, boolean z6, AuthorProfileViewModel authorProfileViewModel, AuthorProfileState authorProfileState) {
        authorProfileState.getClass();
        if (asyncCallResult instanceof AsyncCallResult.Success) {
            AuthorProfile author = authorProfileState.getAuthor();
            if (author == null) {
                return AuthorProfileState.copy$default(authorProfileState, null, null, false, false, null, null, null, 119, null);
            }
            String authorId = authorProfileState.getAuthorId();
            if (authorId != null) {
                g0.D(c1.h(authorProfileViewModel), null, null, new AuthorProfileViewModel$handleFollowResult$1$1$1(authorProfileViewModel, authorId, null), 3);
            }
            if (!z6) {
                g0.D(c1.h(authorProfileViewModel), authorProfileViewModel.getDispatcherFactory().getDefault(), null, new AuthorProfileViewModel$handleFollowResult$1$2(authorProfileViewModel, null), 2);
            }
            authorProfileViewModel.showAuthorFollowUnfollowSuccessToast(author, z6);
            return AuthorProfileState.copy$default(authorProfileState, null, AuthorProfile.copy$default(author, null, null, !z6, 3, null), false, false, null, null, null, 117, null);
        }
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            authorProfileViewModel.logger.log("AuthorProfileScreen", "Follow/unfollow failed: " + asyncCallResult);
            ToastService.showToast$default(authorProfileViewModel.toastService, authorProfileViewModel.stringProvider.getString(R.string.error_network_error), null, ToastService.ToastVariant.ERROR, 2, null);
            return AuthorProfileState.copy$default(authorProfileState, null, null, false, false, null, null, null, 119, null);
        }
        c6.p();
        return null;
    }

    private final void initSubpagePagingData(String authorId, String subpageId, String sortKey) {
        if (sortKey == null) {
            sortKey = ((AuthorProfileState) getStateFlow().getValue()).getCurrentSubpageSortKeys().get(subpageId);
        }
        String str = sortKey;
        this._subpagePagingData = ta.l.b(new e0(new j1.c(new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.f(this, authorId, subpageId, str, 5), null, 1), new w0(20, 3, 20, 48)).f32574e, c1.h(this));
    }

    public static /* synthetic */ void initSubpagePagingData$default(AuthorProfileViewModel authorProfileViewModel, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        authorProfileViewModel.initSubpagePagingData(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n1 initSubpagePagingData$lambda$0(AuthorProfileViewModel authorProfileViewModel, String str, String str2, String str3) {
        return new AuthorSubpagePagingSource(authorProfileViewModel.authorService, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AuthorProfileState onFollowToggle$lambda$0(AuthorProfileViewModel authorProfileViewModel, AuthorProfileState authorProfileState) {
        String authorId;
        authorProfileState.getClass();
        AuthorProfile author = authorProfileState.getAuthor();
        if (author == null || (authorId = authorProfileState.getAuthorId()) == null) {
            return authorProfileState;
        }
        g0.D(c1.h(authorProfileViewModel), null, null, new AuthorProfileViewModel$onFollowToggle$1$1(author.isFollowing(), authorProfileViewModel, authorId, null), 3);
        return AuthorProfileState.copy$default(authorProfileState, null, null, false, true, null, null, null, 119, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AuthorProfileState onSortChange$lambda$0(String str, String str2, AuthorProfileState authorProfileState) {
        authorProfileState.getClass();
        return AuthorProfileState.copy$default(authorProfileState, null, null, false, false, null, null, a0.O(new sn.k(str, str2), authorProfileState.getCurrentSubpageSortKeys()), 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AuthorProfileState selectTab$lambda$0(SelectedSubpage selectedSubpage, AuthorProfileState authorProfileState) {
        authorProfileState.getClass();
        return AuthorProfileState.copy$default(authorProfileState, null, null, false, false, null, selectedSubpage, null, 95, null);
    }

    private final void showAuthorFollowUnfollowSuccessToast(AuthorProfile author, boolean wasFollowing) {
        AuthorActionsSection data;
        String authorName;
        int i10;
        List<AuthorProfileSection> sections = author.getSections();
        ArrayList arrayList = new ArrayList();
        for (Object obj : sections) {
            if (obj instanceof AuthorProfileSection.Actions) {
                arrayList.add(obj);
            }
        }
        AuthorProfileSection.Actions actions = (AuthorProfileSection.Actions) tn.o.y0(arrayList);
        if (actions != null && (data = actions.getData()) != null && (authorName = data.getAuthorName()) != null) {
            if (wasFollowing) {
                i10 = R.string.author_profile_unfollow_success_title;
            } else {
                i10 = R.string.author_profile_follow_success_title;
            }
            this.toastService.showToast(new ToastService.Toast.Action(null, this.stringProvider.getString(i10, authorName), null, 4, null));
        }
    }

    public final ir.i getSubpagePagingData() {
        ir.i iVar = this._subpagePagingData;
        if (iVar == null) {
            return new u(new z0(new u(new ta.z(null), 3), z0.f32777e, z0.f32778f, new q2.z0(21)), 3);
        }
        return iVar;
    }

    public final void init(String authorId) {
        authorId.getClass();
        this.logger.log("AuthorProfileScreen", "init - authorId=".concat(authorId));
        if (((AuthorProfileState) getStateFlow().getValue()).getAuthor() != null) {
            return;
        }
        doInit(authorId);
    }

    public final MviViewModel.StateUpdate onFollowToggle() {
        return queueStateUpdate(new i(1, this));
    }

    public final void onRetry() {
        String authorId = ((AuthorProfileState) getStateFlow().getValue()).getAuthorId();
        if (authorId == null) {
            return;
        }
        doInit(authorId);
    }

    public final void onSortChange(String subpageId, String newSortKey) {
        subpageId.getClass();
        newSortKey.getClass();
        AuthorProfileState authorProfileState = (AuthorProfileState) getStateFlow().getValue();
        queueStateUpdate(new d0(1, subpageId, newSortKey));
        String authorId = authorProfileState.getAuthorId();
        if (authorId != null) {
            initSubpagePagingData(authorId, subpageId, newSortKey);
        }
    }

    public final void selectTab(int index) {
        List<AuthorProfilePage> list;
        AuthorProfileState authorProfileState = (AuthorProfileState) getStateFlow().getValue();
        AuthorProfile author = authorProfileState.getAuthor();
        if (author != null) {
            list = author.getPages();
        } else {
            list = null;
        }
        if (list != null && index < list.size()) {
            AuthorProfilePage authorProfilePage = list.get(index);
            queueStateUpdate(new b(new SelectedSubpage(authorProfilePage.getId(), index), 4));
            String authorId = authorProfileState.getAuthorId();
            if (authorId != null) {
                initSubpagePagingData$default(this, authorId, authorProfilePage.getId(), null, 4, null);
            }
        }
    }
}
