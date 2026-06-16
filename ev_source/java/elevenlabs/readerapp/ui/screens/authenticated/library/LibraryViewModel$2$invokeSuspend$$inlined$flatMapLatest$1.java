package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$2$invokeSuspend$$inlined$flatMapLatest$1", f = "LibraryViewModel.kt", l = {193, 198, 189}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {TokenNames.R, TokenNames.T, "Lir/j;", "it", "Lsn/z;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class LibraryViewModel$2$invokeSuspend$$inlined$flatMapLatest$1 extends yn.i implements ho.q {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ LibraryViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryViewModel$2$invokeSuspend$$inlined$flatMapLatest$1(wn.c cVar, LibraryViewModel libraryViewModel) {
        super(3, cVar);
        this.this$0 = libraryViewModel;
    }

    public final Object invoke(ir.j jVar, sn.p pVar, wn.c<? super sn.z> cVar) {
        LibraryViewModel$2$invokeSuspend$$inlined$flatMapLatest$1 libraryViewModel$2$invokeSuspend$$inlined$flatMapLatest$1 = new LibraryViewModel$2$invokeSuspend$$inlined$flatMapLatest$1(cVar, this.this$0);
        libraryViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.L$0 = jVar;
        libraryViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.L$1 = pVar;
        return libraryViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c7, code lost:
    
        if (ir.r.r(r0, (ir.i) r10, r9) == r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c9, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r10 == r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b0, code lost:
    
        if (r10 == r5) goto L23;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ir.j jVar;
        jl.a aVar;
        jl.a aVar2;
        int i10 = this.label;
        xn.a aVar3 = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    sn.a.g(obj);
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jVar = (ir.j) this.L$2;
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            jVar = (ir.j) this.L$0;
            sn.p pVar = (sn.p) this.L$1;
            int intValue = ((Number) pVar.f31610a).intValue();
            ReadsService.SortBy sortBy = (ReadsService.SortBy) pVar.f31611b;
            int i11 = LibraryViewModel.AnonymousClass2.WhenMappings.$EnumSwitchMapping$0[((LibraryTab) pVar.f31612c).ordinal()];
            if (i11 == 1) {
                aVar = this.this$0.readsService;
                ReadsService readsService = (ReadsService) aVar.get();
                Boolean bool = Boolean.FALSE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = jVar;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.I$0 = 0;
                this.I$1 = intValue;
                this.label = 1;
                obj = readsService.getReads(intValue, bool, sortBy, this);
            } else if (i11 == 2) {
                aVar2 = this.this$0.readsService;
                ReadsService readsService2 = (ReadsService) aVar2.get();
                Boolean bool2 = Boolean.TRUE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = jVar;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.I$0 = 0;
                this.I$1 = intValue;
                this.label = 2;
                obj = readsService2.getReads(intValue, bool2, sortBy, this);
            } else {
                obj = ir.h.f17943a;
            }
            return sn.z.f31622a;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.label = 3;
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((ir.j) obj, (sn.p) obj2, (wn.c<? super sn.z>) obj3);
    }
}
