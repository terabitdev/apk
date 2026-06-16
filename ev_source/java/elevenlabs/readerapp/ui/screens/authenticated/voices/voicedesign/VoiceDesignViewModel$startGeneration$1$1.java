package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign;

import android.net.Uri;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.p;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.VoiceDesignPreview;
import io.elevenlabs.domain.services.VoiceDesignPreviewsResult;
import io.elevenlabs.domain.services.VoiceDesignService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignViewModel$startGeneration$1$1", f = "VoiceDesignViewModel.kt", l = {138, 144}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoiceDesignViewModel$startGeneration$1$1 extends yn.i implements p {
    final /* synthetic */ VoiceDesignContract.State $this_queueStateUpdate;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ VoiceDesignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceDesignViewModel$startGeneration$1$1(VoiceDesignViewModel voiceDesignViewModel, VoiceDesignContract.State state, wn.c<? super VoiceDesignViewModel$startGeneration$1$1> cVar) {
        super(2, cVar);
        this.this$0 = voiceDesignViewModel;
        this.$this_queueStateUpdate = state;
    }

    public static final VoiceDesignContract.State invokeSuspend$lambda$1(VoiceDesignPreviewsResult voiceDesignPreviewsResult, List list, VoiceDesignContract.State state) {
        return VoiceDesignContract.State.copy$default(state, VoiceDesignContract.Step.SELECT_PREVIEW, null, false, list, voiceDesignPreviewsResult.getText(), 0, null, false, null, false, false, null, null, false, 16322, null);
    }

    public static final VoiceDesignContract.State invokeSuspend$lambda$2(VoiceDesignViewModel voiceDesignViewModel, AsyncCallResult asyncCallResult, VoiceDesignContract.State state) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        VoiceDesignContract.Step step = VoiceDesignContract.Step.VOICE_PROMPT;
        resolveErrorMessageUseCase = voiceDesignViewModel.resolveErrorMessage;
        return VoiceDesignContract.State.copy$default(state, step, null, false, null, null, 0, null, false, null, false, false, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, false, 14330, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoiceDesignViewModel$startGeneration$1$1(this.this$0, this.$this_queueStateUpdate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoiceDesignViewModel$startGeneration$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r1 == r6) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a5  */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00e5 -> B:6:0x00e6). Please report as a decompilation issue!!! */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        VoiceDesignService voiceDesignService;
        Object createPreviews;
        Analytics analytics;
        Logger logger;
        Analytics analytics2;
        VoiceDesignPreviewsResult voiceDesignPreviewsResult;
        Iterator it;
        int i10;
        int i11;
        VoiceDesignViewModel voiceDesignViewModel;
        Collection collection;
        int i12;
        DispatcherFactory dispatcherFactory;
        StringProvider stringProvider;
        int i13 = this.label;
        int i14 = 0;
        boolean z6 = true;
        wn.c cVar = null;
        xn.a aVar = xn.a.f37986a;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    i10 = this.I$3;
                    int i15 = this.I$2;
                    i12 = this.I$1;
                    i11 = this.I$0;
                    collection = (Collection) this.L$9;
                    VoiceDesignPreview voiceDesignPreview = (VoiceDesignPreview) this.L$8;
                    it = (Iterator) this.L$6;
                    Collection collection2 = (Collection) this.L$5;
                    voiceDesignViewModel = (VoiceDesignViewModel) this.L$3;
                    voiceDesignPreviewsResult = (VoiceDesignPreviewsResult) this.L$1;
                    sn.a.g(obj);
                    Object Q = obj;
                    boolean z10 = z6;
                    String generatedVoiceId = voiceDesignPreview.getGeneratedVoiceId();
                    wn.c cVar2 = cVar;
                    stringProvider = voiceDesignViewModel.stringProvider;
                    String string = stringProvider.getString(R.string.voice_design_voice_label, new Integer(i10 + 1));
                    String uri = ((Uri) Q).toString();
                    uri.getClass();
                    collection.add(new VoiceDesignContract.PreviewItem(generatedVoiceId, string, uri, voiceDesignPreview.getDurationSeconds()));
                    i10 = i15;
                    collection = collection2;
                    z6 = z10;
                    cVar = cVar2;
                    aVar = aVar;
                    i14 = 0;
                    if (it.hasNext()) {
                        Object next = it.next();
                        i15 = i10 + 1;
                        if (i10 >= 0) {
                            voiceDesignPreview = (VoiceDesignPreview) next;
                            dispatcherFactory = voiceDesignViewModel.getDispatcherFactory();
                            fr.z io2 = dispatcherFactory.getIo();
                            VoiceDesignViewModel$startGeneration$1$1$previewItems$1$fileUri$1 voiceDesignViewModel$startGeneration$1$1$previewItems$1$fileUri$1 = new VoiceDesignViewModel$startGeneration$1$1$previewItems$1$fileUri$1(voiceDesignViewModel, voiceDesignPreview, cVar);
                            this.L$0 = cVar;
                            this.L$1 = voiceDesignPreviewsResult;
                            this.L$2 = cVar;
                            this.L$3 = voiceDesignViewModel;
                            this.L$4 = cVar;
                            this.L$5 = collection;
                            this.L$6 = it;
                            this.L$7 = cVar;
                            this.L$8 = voiceDesignPreview;
                            this.L$9 = collection;
                            this.I$0 = i11;
                            this.I$1 = i12;
                            this.I$2 = i15;
                            this.I$3 = i10;
                            this.I$4 = i14;
                            this.label = 2;
                            Q = g0.Q(io2, voiceDesignViewModel$startGeneration$1$1$previewItems$1$fileUri$1, this);
                            if (Q != aVar) {
                                collection2 = collection;
                                boolean z102 = z6;
                                String generatedVoiceId2 = voiceDesignPreview.getGeneratedVoiceId();
                                wn.c cVar22 = cVar;
                                stringProvider = voiceDesignViewModel.stringProvider;
                                String string2 = stringProvider.getString(R.string.voice_design_voice_label, new Integer(i10 + 1));
                                String uri2 = ((Uri) Q).toString();
                                uri2.getClass();
                                collection.add(new VoiceDesignContract.PreviewItem(generatedVoiceId2, string2, uri2, voiceDesignPreview.getDurationSeconds()));
                                i10 = i15;
                                collection = collection2;
                                z6 = z102;
                                cVar = cVar22;
                                aVar = aVar;
                                i14 = 0;
                                if (it.hasNext()) {
                                    this.this$0.queueStateUpdate(new k(voiceDesignPreviewsResult, (List) collection, 0));
                                    return z.f31622a;
                                }
                            }
                            return aVar;
                        }
                        ?? r17 = cVar;
                        ig.f.U();
                        throw r17;
                    }
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                createPreviews = obj;
            }
        } else {
            sn.a.g(obj);
            voiceDesignService = this.this$0.voiceDesignService;
            String voiceDescription = this.$this_queueStateUpdate.getVoiceDescription();
            this.label = 1;
            createPreviews = voiceDesignService.createPreviews(voiceDescription, this);
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) createPreviews;
        if (asyncCallResult instanceof AsyncCallResult.Success) {
            analytics2 = this.this$0.analytics;
            analytics2.log(Analytics.Event.VoiceDesignGenerateSuccess.INSTANCE);
            VoiceDesignPreviewsResult voiceDesignPreviewsResult2 = (VoiceDesignPreviewsResult) ((AsyncCallResult.Success) asyncCallResult).getData();
            List<VoiceDesignPreview> previews = voiceDesignPreviewsResult2.getPreviews();
            VoiceDesignViewModel voiceDesignViewModel2 = this.this$0;
            ArrayList arrayList = new ArrayList(tn.p.a0(previews, 10));
            voiceDesignPreviewsResult = voiceDesignPreviewsResult2;
            it = previews.iterator();
            i10 = 0;
            i11 = 0;
            voiceDesignViewModel = voiceDesignViewModel2;
            collection = arrayList;
            i12 = 0;
            if (it.hasNext()) {
            }
        } else {
            if (asyncCallResult instanceof AsyncCallResult.Error) {
                analytics = this.this$0.analytics;
                analytics.log(Analytics.Event.VoiceDesignGenerateError.INSTANCE);
                logger = this.this$0.logger;
                logger.logError(VoiceDesignViewModel.TAG, "Failed to generate voice previews", null);
                VoiceDesignViewModel voiceDesignViewModel3 = this.this$0;
                voiceDesignViewModel3.queueStateUpdate(new j(voiceDesignViewModel3, (AsyncCallResult.Error) asyncCallResult, 1));
                return z.f31622a;
            }
            c6.p();
            return null;
        }
    }
}
