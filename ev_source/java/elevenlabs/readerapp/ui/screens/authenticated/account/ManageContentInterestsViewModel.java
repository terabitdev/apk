package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import a2.o0;
import androidx.lifecycle.c1;
import fr.g0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.InterestsAnswer;
import io.elevenlabs.domain.model.InterestsQuestion;
import io.elevenlabs.domain.services.InterestsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0010J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0006\u0010\u0018\u001a\u00020\u0010J\u001a\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/account/ManageContentInterestsViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/account/ManageContentInterestsState;", "dispatcherFactory", "Lio/elevenlabs/domain/DispatcherFactory;", "interestsService", "Lio/elevenlabs/domain/services/InterestsService;", "toastService", "Lio/elevenlabs/domain/services/ToastService;", "resolveErrorMessage", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "logger", "Lio/elevenlabs/domain/Logger;", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/InterestsService;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/Logger;)V", "loadInterests", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "toggleInterestSelection", "question", "Lio/elevenlabs/domain/model/InterestsQuestion;", "answerKey", "", "onSaveClick", "submitInterests", "onNavigateBack", "computeSaveEnabled", "", "isSubmitLoading", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ManageContentInterestsViewModel extends MviViewModel<ManageContentInterestsState> {

    @Deprecated
    public static final String TAG = "ManageContentInterestsViewModel";
    private final InterestsService interestsService;
    private final Logger logger;
    private final ResolveErrorMessageUseCase resolveErrorMessage;
    private final ToastService toastService;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ManageContentInterestsViewModel(DispatcherFactory dispatcherFactory, InterestsService interestsService, ToastService toastService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Logger logger) {
        super(new ManageContentInterestsState(false, false, null, false, null, false, 63, null), dispatcherFactory, r3, 4, 0 == true ? 1 : 0);
        dispatcherFactory.getClass();
        interestsService.getClass();
        toastService.getClass();
        resolveErrorMessageUseCase.getClass();
        logger.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        this.interestsService = interestsService;
        this.toastService = toastService;
        this.resolveErrorMessage = resolveErrorMessageUseCase;
        this.logger = logger;
        loadInterests();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean computeSaveEnabled(InterestsQuestion question, boolean isSubmitLoading) {
        int i10;
        List<InterestsAnswer> answers;
        if (question != null && (answers = question.getAnswers()) != null && !answers.isEmpty()) {
            Iterator<T> it = answers.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((InterestsAnswer) it.next()).getSelected() && (i10 = i10 + 1) < 0) {
                    ig.f.T();
                    throw null;
                }
            }
        } else {
            i10 = 0;
        }
        if (i10 < 2 || isSubmitLoading) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ManageContentInterestsState loadInterests$lambda$0(ManageContentInterestsViewModel manageContentInterestsViewModel, ManageContentInterestsState manageContentInterestsState) {
        manageContentInterestsState.getClass();
        if (manageContentInterestsState.isLoading()) {
            return manageContentInterestsState;
        }
        g0.D(c1.h(manageContentInterestsViewModel), manageContentInterestsViewModel.getDispatcherFactory().getDefault(), null, new ManageContentInterestsViewModel$loadInterests$1$1(manageContentInterestsViewModel, null), 2);
        return ManageContentInterestsState.copy$default(manageContentInterestsState, true, false, null, false, null, false, 46, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ManageContentInterestsState onNavigateBack$lambda$0(ManageContentInterestsState manageContentInterestsState) {
        manageContentInterestsState.getClass();
        return ManageContentInterestsState.copy$default(manageContentInterestsState, false, false, null, false, null, false, 55, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ManageContentInterestsState onSaveClick$lambda$0(ManageContentInterestsViewModel manageContentInterestsViewModel, ManageContentInterestsState manageContentInterestsState) {
        manageContentInterestsState.getClass();
        InterestsQuestion question = manageContentInterestsState.getQuestion();
        if (question != null) {
            List<InterestsAnswer> answers = question.getAnswers();
            int i10 = 0;
            if (answers == null || !answers.isEmpty()) {
                Iterator<T> it = answers.iterator();
                while (it.hasNext()) {
                    if (((InterestsAnswer) it.next()).getSelected() && (i10 = i10 + 1) < 0) {
                        ig.f.T();
                        throw null;
                    }
                }
            }
            if (i10 >= 2) {
                manageContentInterestsViewModel.submitInterests(question);
                return manageContentInterestsState;
            }
        }
        return manageContentInterestsState;
    }

    private final MviViewModel.StateUpdate submitInterests(InterestsQuestion question) {
        return queueStateUpdate(new i(this, question, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ManageContentInterestsState submitInterests$lambda$0(ManageContentInterestsViewModel manageContentInterestsViewModel, InterestsQuestion interestsQuestion, ManageContentInterestsState manageContentInterestsState) {
        manageContentInterestsState.getClass();
        manageContentInterestsViewModel.logger.log(TAG, "Submitting " + interestsQuestion);
        if (manageContentInterestsState.isSubmitLoading()) {
            return manageContentInterestsState;
        }
        g0.D(c1.h(manageContentInterestsViewModel), manageContentInterestsViewModel.getDispatcherFactory().getDefault(), null, new ManageContentInterestsViewModel$submitInterests$1$1(manageContentInterestsViewModel, interestsQuestion, null), 2);
        return ManageContentInterestsState.copy$default(manageContentInterestsState, false, true, null, false, null, false, 61, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ManageContentInterestsState toggleInterestSelection$lambda$0(InterestsQuestion interestsQuestion, ManageContentInterestsViewModel manageContentInterestsViewModel, String str, ManageContentInterestsState manageContentInterestsState) {
        manageContentInterestsState.getClass();
        InterestsQuestion question = manageContentInterestsState.getQuestion();
        if (question == null || !kotlin.jvm.internal.m.c(question.getKey(), interestsQuestion.getKey())) {
            return manageContentInterestsState;
        }
        List<InterestsAnswer> answers = question.getAnswers();
        ArrayList arrayList = new ArrayList(tn.p.a0(answers, 10));
        for (InterestsAnswer interestsAnswer : answers) {
            if (kotlin.jvm.internal.m.c(interestsAnswer.getKey(), str)) {
                interestsAnswer = InterestsAnswer.copy$default(interestsAnswer, null, null, !interestsAnswer.getSelected(), null, 11, null);
            }
            arrayList.add(interestsAnswer);
        }
        InterestsQuestion copy$default = InterestsQuestion.copy$default(question, null, null, false, arrayList, 7, null);
        return ManageContentInterestsState.copy$default(manageContentInterestsState, false, false, copy$default, false, null, manageContentInterestsViewModel.computeSaveEnabled(copy$default, manageContentInterestsState.isSubmitLoading()), 27, null);
    }

    public final MviViewModel.StateUpdate loadInterests() {
        return queueStateUpdate(new u(this, 1));
    }

    public final MviViewModel.StateUpdate onNavigateBack() {
        return queueStateUpdate(new t(2));
    }

    public final MviViewModel.StateUpdate onSaveClick() {
        return queueStateUpdate(new u(this, 0));
    }

    public final MviViewModel.StateUpdate toggleInterestSelection(InterestsQuestion question, String answerKey) {
        question.getClass();
        answerKey.getClass();
        return queueStateUpdate(new o0(question, this, answerKey, 15));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/account/ManageContentInterestsViewModel$Companion;", "", "<init>", "()V", "TAG", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        private Companion() {
        }
    }
}
