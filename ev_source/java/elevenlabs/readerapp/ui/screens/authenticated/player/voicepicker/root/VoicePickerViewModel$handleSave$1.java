package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.EffectivePlaybackModeKt;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.VoicesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository;
import ir.r;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerViewModel$handleSave$1", f = "VoicePickerViewModel.kt", l = {210, 211, 214, 230, 234}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerViewModel$handleSave$1 extends yn.i implements p {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ VoicePickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerViewModel$handleSave$1(VoicePickerViewModel voicePickerViewModel, wn.c<? super VoicePickerViewModel$handleSave$1> cVar) {
        super(2, cVar);
        this.this$0 = voicePickerViewModel;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePickerViewModel$handleSave$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerViewModel$handleSave$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0174 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:10:0x001f, B:11:0x0192, B:12:0x0197, B:20:0x0037, B:22:0x016c, B:24:0x0174, B:29:0x0046, B:30:0x011b, B:32:0x0121, B:34:0x0148, B:37:0x0155, B:41:0x014f, B:42:0x0154, B:44:0x0053, B:45:0x00f5, B:47:0x00f9, B:49:0x0101, B:55:0x0060, B:56:0x00e5, B:62:0x007b, B:64:0x00b2, B:66:0x00bc, B:68:0x00c4), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0121 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:10:0x001f, B:11:0x0192, B:12:0x0197, B:20:0x0037, B:22:0x016c, B:24:0x0174, B:29:0x0046, B:30:0x011b, B:32:0x0121, B:34:0x0148, B:37:0x0155, B:41:0x014f, B:42:0x0154, B:44:0x0053, B:45:0x00f5, B:47:0x00f9, B:49:0x0101, B:55:0x0060, B:56:0x00e5, B:62:0x007b, B:64:0x00b2, B:66:0x00bc, B:68:0x00c4), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0148 A[Catch: all -> 0x0024, TRY_ENTER, TryCatch #0 {all -> 0x0024, blocks: (B:10:0x001f, B:11:0x0192, B:12:0x0197, B:20:0x0037, B:22:0x016c, B:24:0x0174, B:29:0x0046, B:30:0x011b, B:32:0x0121, B:34:0x0148, B:37:0x0155, B:41:0x014f, B:42:0x0154, B:44:0x0053, B:45:0x00f5, B:47:0x00f9, B:49:0x0101, B:55:0x0060, B:56:0x00e5, B:62:0x007b, B:64:0x00b2, B:66:0x00bc, B:68:0x00c4), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:10:0x001f, B:11:0x0192, B:12:0x0197, B:20:0x0037, B:22:0x016c, B:24:0x0174, B:29:0x0046, B:30:0x011b, B:32:0x0121, B:34:0x0148, B:37:0x0155, B:41:0x014f, B:42:0x0154, B:44:0x0053, B:45:0x00f5, B:47:0x00f9, B:49:0x0101, B:55:0x0060, B:56:0x00e5, B:62:0x007b, B:64:0x00b2, B:66:0x00bc, B:68:0x00c4), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:10:0x001f, B:11:0x0192, B:12:0x0197, B:20:0x0037, B:22:0x016c, B:24:0x0174, B:29:0x0046, B:30:0x011b, B:32:0x0121, B:34:0x0148, B:37:0x0155, B:41:0x014f, B:42:0x0154, B:44:0x0053, B:45:0x00f5, B:47:0x00f9, B:49:0x0101, B:55:0x0060, B:56:0x00e5, B:62:0x007b, B:64:0x00b2, B:66:0x00bc, B:68:0x00c4), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v27, types: [int] */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v44 */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Analytics analytics;
        VoicePickerSharedRepository voicePickerSharedRepository;
        VoicePickerSharedRepository voicePickerSharedRepository2;
        VoicePickerSharedContract.State state;
        String selectedVoiceId;
        VoicesService voicesService;
        VoicePickerSharedContract.State state2;
        Boolean bool;
        ?? r15;
        VoicesService voicesService2;
        int i10;
        String str;
        VoicesService voicesService3;
        VoicePickerSharedContract.State state3;
        AsyncCallResult asyncCallResult;
        ToastService toastService;
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        VoicePickerViewModel voicePickerViewModel;
        n nVar;
        ReadsService readsService;
        VoicePickerSharedContract.State state4;
        int i11 = this.label;
        z zVar = z.f31622a;
        xn.a aVar = xn.a.f37986a;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    selectedVoiceId = (String) this.L$1;
                                    state4 = (VoicePickerSharedContract.State) this.L$0;
                                    sn.a.g(obj);
                                    this.this$0.logVoiceChangerSwap(state4, selectedVoiceId);
                                    this.this$0.onEvent(VoicePickerContract.Event.Close.INSTANCE);
                                    voicePickerViewModel = this.this$0;
                                    nVar = new n(1);
                                    voicePickerViewModel.queueStateUpdate(nVar);
                                    return zVar;
                                }
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            selectedVoiceId = (String) this.L$1;
                            state3 = (VoicePickerSharedContract.State) this.L$0;
                            sn.a.g(obj);
                            state = state3;
                            if (state.getMode() instanceof VoicePickerMode.VoicePicker) {
                                readsService = this.this$0.readsService;
                                String readId = ((VoicePickerMode.VoicePicker) state.getMode()).getReadId();
                                this.L$0 = state;
                                this.L$1 = selectedVoiceId;
                                this.label = 5;
                                if (readsService.updateLastUsedVoiceId(readId, selectedVoiceId, this) != aVar) {
                                    state4 = state;
                                    this.this$0.logVoiceChangerSwap(state4, selectedVoiceId);
                                }
                                return aVar;
                            }
                            this.this$0.onEvent(VoicePickerContract.Event.Close.INSTANCE);
                            voicePickerViewModel = this.this$0;
                            nVar = new n(1);
                            voicePickerViewModel.queueStateUpdate(nVar);
                            return zVar;
                        }
                        i10 = this.I$0;
                        str = (String) this.L$1;
                        state2 = (VoicePickerSharedContract.State) this.L$0;
                        sn.a.g(obj);
                        asyncCallResult = (AsyncCallResult) obj;
                        if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
                            toastService = this.this$0.toastService;
                            resolveErrorMessageUseCase = this.this$0.resolveErrorMessageUseCase;
                            ToastService.showToast$default(toastService, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, ToastService.ToastVariant.ERROR, 2, null);
                            voicePickerViewModel = this.this$0;
                            nVar = new n(1);
                            voicePickerViewModel.queueStateUpdate(nVar);
                            return zVar;
                        }
                        if (asyncCallResult instanceof AsyncCallResult.Success) {
                            r15 = i10;
                            selectedVoiceId = str;
                            voicesService3 = this.this$0.voicesService;
                            this.L$0 = state2;
                            this.L$1 = selectedVoiceId;
                            this.I$0 = r15;
                            this.label = 4;
                            if (voicesService3.setDefaultVoice(selectedVoiceId, this) != aVar) {
                                state3 = state2;
                                state = state3;
                                if (state.getMode() instanceof VoicePickerMode.VoicePicker) {
                                }
                                this.this$0.onEvent(VoicePickerContract.Event.Close.INSTANCE);
                                voicePickerViewModel = this.this$0;
                                nVar = new n(1);
                                voicePickerViewModel.queueStateUpdate(nVar);
                                return zVar;
                            }
                            return aVar;
                        }
                        throw new RuntimeException();
                    }
                    selectedVoiceId = (String) this.L$1;
                    state2 = (VoicePickerSharedContract.State) this.L$0;
                    sn.a.g(obj);
                    bool = (Boolean) obj;
                    if (bool == null) {
                        r15 = bool.booleanValue();
                    } else {
                        r15 = 0;
                    }
                    if (r15 == 0) {
                        voicesService2 = this.this$0.voicesService;
                        this.L$0 = state2;
                        this.L$1 = selectedVoiceId;
                        this.I$0 = r15 == true ? 1 : 0;
                        this.label = 3;
                        Object addVoice = voicesService2.addVoice(selectedVoiceId, this);
                        if (addVoice != aVar) {
                            String str2 = selectedVoiceId;
                            i10 = r15 == true ? 1 : 0;
                            obj = addVoice;
                            str = str2;
                            asyncCallResult = (AsyncCallResult) obj;
                            if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
                            }
                        } else {
                            return aVar;
                        }
                    }
                    voicesService3 = this.this$0.voicesService;
                    this.L$0 = state2;
                    this.L$1 = selectedVoiceId;
                    this.I$0 = r15;
                    this.label = 4;
                    if (voicesService3.setDefaultVoice(selectedVoiceId, this) != aVar) {
                    }
                } else {
                    selectedVoiceId = (String) this.L$1;
                    state2 = (VoicePickerSharedContract.State) this.L$0;
                    sn.a.g(obj);
                }
            } else {
                sn.a.g(obj);
                if (!((VoicePickerContract.State) this.this$0.getStateFlow().getValue()).isSaveLoading()) {
                    this.this$0.queueStateUpdate(new n(0));
                    analytics = this.this$0.analytics;
                    analytics.log(Analytics.Event.ChangedDefaultVoice.INSTANCE);
                    voicePickerSharedRepository = this.this$0.sharedRepository;
                    voicePickerSharedRepository.onEvent(VoicePickerSharedContract.Event.CancelVoicePreview.INSTANCE);
                    voicePickerSharedRepository2 = this.this$0.sharedRepository;
                    state = (VoicePickerSharedContract.State) voicePickerSharedRepository2.getStateFlow().getValue();
                    selectedVoiceId = state.getSelectedVoiceId();
                    if (selectedVoiceId != null && !selectedVoiceId.equals(state.getFallbackVoiceId())) {
                        if (!selectedVoiceId.equals(EffectivePlaybackModeKt.ORIGINAL_AUDIO)) {
                            this.this$0.onSharedEvent(new VoicePickerSharedContract.Event.UpdateFallbackVoiceId(selectedVoiceId));
                            voicesService = this.this$0.voicesService;
                            this.L$0 = state;
                            this.L$1 = selectedVoiceId;
                            this.label = 1;
                            Object isSaved = voicesService.isSaved(selectedVoiceId, this);
                            if (isSaved != aVar) {
                                state2 = state;
                                obj = isSaved;
                            } else {
                                return aVar;
                            }
                        }
                        if (state.getMode() instanceof VoicePickerMode.VoicePicker) {
                        }
                    }
                    this.this$0.onEvent(VoicePickerContract.Event.Close.INSTANCE);
                    voicePickerViewModel = this.this$0;
                    nVar = new n(1);
                    voicePickerViewModel.queueStateUpdate(nVar);
                    return zVar;
                }
                return zVar;
            }
            this.L$0 = state2;
            this.L$1 = selectedVoiceId;
            this.label = 2;
            obj = r.w((ir.i) obj, this);
            if (obj == aVar) {
                return aVar;
            }
            bool = (Boolean) obj;
            if (bool == null) {
            }
            if (r15 == 0) {
            }
            voicesService3 = this.this$0.voicesService;
            this.L$0 = state2;
            this.L$1 = selectedVoiceId;
            this.I$0 = r15;
            this.label = 4;
            if (voicesService3.setDefaultVoice(selectedVoiceId, this) != aVar) {
            }
        } catch (Throwable th) {
            this.this$0.queueStateUpdate(new n(1));
            throw th;
        }
    }
}
