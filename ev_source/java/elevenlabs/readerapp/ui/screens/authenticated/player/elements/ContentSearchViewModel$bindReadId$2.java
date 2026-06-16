package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.ChapterContent;
import io.elevenlabs.domain.services.ReadsService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$bindReadId$2", f = "ContentSearchSheet.kt", l = {146, 146}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ContentSearchViewModel$bindReadId$2 extends yn.i implements ho.p {
    final /* synthetic */ String $readId;
    Object L$0;
    int label;
    final /* synthetic */ ContentSearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentSearchViewModel$bindReadId$2(ContentSearchViewModel contentSearchViewModel, String str, wn.c<? super ContentSearchViewModel$bindReadId$2> cVar) {
        super(2, cVar);
        this.this$0 = contentSearchViewModel;
        this.$readId = str;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ContentSearchViewModel$bindReadId$2(this.this$0, this.$readId, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ContentSearchViewModel$bindReadId$2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        if (((ir.i) r6).collect(r2, r5) == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r6 == r3) goto L33;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List arrayList;
        jl.a aVar;
        int i10 = this.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = (List) this.L$0;
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            arrayList = new ArrayList();
            aVar = this.this$0.readsService;
            ReadsService readsService = (ReadsService) aVar.get();
            String str = this.$readId;
            this.L$0 = arrayList;
            this.label = 1;
            obj = readsService.loadAllChapterContent(str, this);
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(arrayList, this.this$0);
        this.L$0 = null;
        this.label = 2;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$bindReadId$2$1 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1<T> implements ir.j {
        final /* synthetic */ List<String> $accumulated;
        final /* synthetic */ ContentSearchViewModel this$0;

        public AnonymousClass1(List<String> list, ContentSearchViewModel contentSearchViewModel) {
            this.$accumulated = list;
            this.this$0 = contentSearchViewModel;
        }

        public static final ContentSearchState emit$lambda$0(List list, ContentSearchState contentSearchState) {
            contentSearchState.getClass();
            return ContentSearchState.copy$default(contentSearchState, null, null, false, list, null, 23, null);
        }

        public final Object emit(ChapterContent chapterContent, wn.c<? super sn.z> cVar) {
            tn.o.g0(chapterContent.getElements(), this.$accumulated);
            this.this$0.queueStateUpdate(new l(tn.o.g1(this.$accumulated), 1));
            return sn.z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((ChapterContent) obj, (wn.c<? super sn.z>) cVar);
        }
    }
}
