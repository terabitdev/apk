package io.elevenlabs.player;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.ChapterContent;
import io.elevenlabs.domain.model.ChapterContentKt;
import io.elevenlabs.domain.model.ChapterSlotIndex;
import io.elevenlabs.domain.model.CreateBookmarkRequest;
import io.elevenlabs.domain.model.OptimizedReadPreparation;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.services.ReadBookmarkService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.usecase.MediaAudioPosition;
import io.elevenlabs.domain.usecase.MediaAudioPositionResolver;
import io.elevenlabs.player.CreateBookmarkResult;
import ir.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wq.n;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.CreateBookmarkFromOffsetUseCase$invoke$2", f = "CreateBookmarkFromOffsetUseCase.kt", l = {51, 56, 56, 62, 78, 126}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lio/elevenlabs/player/CreateBookmarkResult;", "<anonymous>", "(Lfr/d0;)Lio/elevenlabs/player/CreateBookmarkResult;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class CreateBookmarkFromOffsetUseCase$invoke$2 extends i implements p {
    final /* synthetic */ long $characterOffset;
    final /* synthetic */ String $readId;
    int I$0;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ CreateBookmarkFromOffsetUseCase this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.player.CreateBookmarkFromOffsetUseCase$invoke$2$1", f = "CreateBookmarkFromOffsetUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lio/elevenlabs/domain/model/OptimizedReadPreparation;"}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.player.CreateBookmarkFromOffsetUseCase$invoke$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends i implements p {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // ho.p
        public final Object invoke(OptimizedReadPreparation optimizedReadPreparation, wn.c<? super Boolean> cVar) {
            return ((AnonymousClass1) create(optimizedReadPreparation, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            OptimizedReadPreparation optimizedReadPreparation = (OptimizedReadPreparation) this.L$0;
            if (this.label == 0) {
                sn.a.g(obj);
                return Boolean.valueOf(optimizedReadPreparation instanceof OptimizedReadPreparation.Ready);
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateBookmarkFromOffsetUseCase$invoke$2(CreateBookmarkFromOffsetUseCase createBookmarkFromOffsetUseCase, String str, long j4, wn.c<? super CreateBookmarkFromOffsetUseCase$invoke$2> cVar) {
        super(2, cVar);
        this.this$0 = createBookmarkFromOffsetUseCase;
        this.$readId = str;
        this.$characterOffset = j4;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new CreateBookmarkFromOffsetUseCase$invoke$2(this.this$0, this.$readId, this.$characterOffset, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super CreateBookmarkResult> cVar) {
        return ((CreateBookmarkFromOffsetUseCase$invoke$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0326, code lost:
    
        if (r0 == r6) goto L131;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0102 A[Catch: Exception -> 0x003f, TRY_ENTER, TryCatch #0 {Exception -> 0x003f, blocks: (B:8:0x0037, B:10:0x0329, B:13:0x0052, B:16:0x017e, B:18:0x0182, B:20:0x01a0, B:22:0x01b3, B:23:0x023f, B:26:0x024b, B:28:0x0255, B:30:0x0267, B:32:0x0283, B:34:0x028d, B:36:0x0298, B:38:0x02aa, B:39:0x02be, B:41:0x02cb, B:43:0x02d9, B:45:0x02ea, B:46:0x02f8, B:53:0x035e, B:55:0x01ba, B:56:0x01cf, B:58:0x01d5, B:61:0x01ea, B:66:0x01ee, B:69:0x022f, B:71:0x0233, B:74:0x0385, B:77:0x01fa, B:80:0x0205, B:81:0x0212, B:84:0x0229, B:89:0x005e, B:91:0x011f, B:93:0x0123, B:96:0x012b, B:98:0x0137, B:99:0x013b, B:101:0x0141, B:105:0x0154, B:109:0x015f, B:112:0x03a1, B:118:0x03bd, B:121:0x006a, B:123:0x00fc, B:126:0x0102, B:128:0x010b, B:133:0x0076, B:134:0x00e8, B:137:0x007d, B:139:0x00ba, B:142:0x00c0, B:144:0x00d5, B:148:0x0086), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x010b A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:8:0x0037, B:10:0x0329, B:13:0x0052, B:16:0x017e, B:18:0x0182, B:20:0x01a0, B:22:0x01b3, B:23:0x023f, B:26:0x024b, B:28:0x0255, B:30:0x0267, B:32:0x0283, B:34:0x028d, B:36:0x0298, B:38:0x02aa, B:39:0x02be, B:41:0x02cb, B:43:0x02d9, B:45:0x02ea, B:46:0x02f8, B:53:0x035e, B:55:0x01ba, B:56:0x01cf, B:58:0x01d5, B:61:0x01ea, B:66:0x01ee, B:69:0x022f, B:71:0x0233, B:74:0x0385, B:77:0x01fa, B:80:0x0205, B:81:0x0212, B:84:0x0229, B:89:0x005e, B:91:0x011f, B:93:0x0123, B:96:0x012b, B:98:0x0137, B:99:0x013b, B:101:0x0141, B:105:0x0154, B:109:0x015f, B:112:0x03a1, B:118:0x03bd, B:121:0x006a, B:123:0x00fc, B:126:0x0102, B:128:0x010b, B:133:0x0076, B:134:0x00e8, B:137:0x007d, B:139:0x00ba, B:142:0x00c0, B:144:0x00d5, B:148:0x0086), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00c0 A[Catch: Exception -> 0x003f, TRY_ENTER, TryCatch #0 {Exception -> 0x003f, blocks: (B:8:0x0037, B:10:0x0329, B:13:0x0052, B:16:0x017e, B:18:0x0182, B:20:0x01a0, B:22:0x01b3, B:23:0x023f, B:26:0x024b, B:28:0x0255, B:30:0x0267, B:32:0x0283, B:34:0x028d, B:36:0x0298, B:38:0x02aa, B:39:0x02be, B:41:0x02cb, B:43:0x02d9, B:45:0x02ea, B:46:0x02f8, B:53:0x035e, B:55:0x01ba, B:56:0x01cf, B:58:0x01d5, B:61:0x01ea, B:66:0x01ee, B:69:0x022f, B:71:0x0233, B:74:0x0385, B:77:0x01fa, B:80:0x0205, B:81:0x0212, B:84:0x0229, B:89:0x005e, B:91:0x011f, B:93:0x0123, B:96:0x012b, B:98:0x0137, B:99:0x013b, B:101:0x0141, B:105:0x0154, B:109:0x015f, B:112:0x03a1, B:118:0x03bd, B:121:0x006a, B:123:0x00fc, B:126:0x0102, B:128:0x010b, B:133:0x0076, B:134:0x00e8, B:137:0x007d, B:139:0x00ba, B:142:0x00c0, B:144:0x00d5, B:148:0x0086), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00d5 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:8:0x0037, B:10:0x0329, B:13:0x0052, B:16:0x017e, B:18:0x0182, B:20:0x01a0, B:22:0x01b3, B:23:0x023f, B:26:0x024b, B:28:0x0255, B:30:0x0267, B:32:0x0283, B:34:0x028d, B:36:0x0298, B:38:0x02aa, B:39:0x02be, B:41:0x02cb, B:43:0x02d9, B:45:0x02ea, B:46:0x02f8, B:53:0x035e, B:55:0x01ba, B:56:0x01cf, B:58:0x01d5, B:61:0x01ea, B:66:0x01ee, B:69:0x022f, B:71:0x0233, B:74:0x0385, B:77:0x01fa, B:80:0x0205, B:81:0x0212, B:84:0x0229, B:89:0x005e, B:91:0x011f, B:93:0x0123, B:96:0x012b, B:98:0x0137, B:99:0x013b, B:101:0x0141, B:105:0x0154, B:109:0x015f, B:112:0x03a1, B:118:0x03bd, B:121:0x006a, B:123:0x00fc, B:126:0x0102, B:128:0x010b, B:133:0x0076, B:134:0x00e8, B:137:0x007d, B:139:0x00ba, B:142:0x00c0, B:144:0x00d5, B:148:0x0086), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0182 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:8:0x0037, B:10:0x0329, B:13:0x0052, B:16:0x017e, B:18:0x0182, B:20:0x01a0, B:22:0x01b3, B:23:0x023f, B:26:0x024b, B:28:0x0255, B:30:0x0267, B:32:0x0283, B:34:0x028d, B:36:0x0298, B:38:0x02aa, B:39:0x02be, B:41:0x02cb, B:43:0x02d9, B:45:0x02ea, B:46:0x02f8, B:53:0x035e, B:55:0x01ba, B:56:0x01cf, B:58:0x01d5, B:61:0x01ea, B:66:0x01ee, B:69:0x022f, B:71:0x0233, B:74:0x0385, B:77:0x01fa, B:80:0x0205, B:81:0x0212, B:84:0x0229, B:89:0x005e, B:91:0x011f, B:93:0x0123, B:96:0x012b, B:98:0x0137, B:99:0x013b, B:101:0x0141, B:105:0x0154, B:109:0x015f, B:112:0x03a1, B:118:0x03bd, B:121:0x006a, B:123:0x00fc, B:126:0x0102, B:128:0x010b, B:133:0x0076, B:134:0x00e8, B:137:0x007d, B:139:0x00ba, B:142:0x00c0, B:144:0x00d5, B:148:0x0086), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01a0 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:8:0x0037, B:10:0x0329, B:13:0x0052, B:16:0x017e, B:18:0x0182, B:20:0x01a0, B:22:0x01b3, B:23:0x023f, B:26:0x024b, B:28:0x0255, B:30:0x0267, B:32:0x0283, B:34:0x028d, B:36:0x0298, B:38:0x02aa, B:39:0x02be, B:41:0x02cb, B:43:0x02d9, B:45:0x02ea, B:46:0x02f8, B:53:0x035e, B:55:0x01ba, B:56:0x01cf, B:58:0x01d5, B:61:0x01ea, B:66:0x01ee, B:69:0x022f, B:71:0x0233, B:74:0x0385, B:77:0x01fa, B:80:0x0205, B:81:0x0212, B:84:0x0229, B:89:0x005e, B:91:0x011f, B:93:0x0123, B:96:0x012b, B:98:0x0137, B:99:0x013b, B:101:0x0141, B:105:0x0154, B:109:0x015f, B:112:0x03a1, B:118:0x03bd, B:121:0x006a, B:123:0x00fc, B:126:0x0102, B:128:0x010b, B:133:0x0076, B:134:0x00e8, B:137:0x007d, B:139:0x00ba, B:142:0x00c0, B:144:0x00d5, B:148:0x0086), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0137 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:8:0x0037, B:10:0x0329, B:13:0x0052, B:16:0x017e, B:18:0x0182, B:20:0x01a0, B:22:0x01b3, B:23:0x023f, B:26:0x024b, B:28:0x0255, B:30:0x0267, B:32:0x0283, B:34:0x028d, B:36:0x0298, B:38:0x02aa, B:39:0x02be, B:41:0x02cb, B:43:0x02d9, B:45:0x02ea, B:46:0x02f8, B:53:0x035e, B:55:0x01ba, B:56:0x01cf, B:58:0x01d5, B:61:0x01ea, B:66:0x01ee, B:69:0x022f, B:71:0x0233, B:74:0x0385, B:77:0x01fa, B:80:0x0205, B:81:0x0212, B:84:0x0229, B:89:0x005e, B:91:0x011f, B:93:0x0123, B:96:0x012b, B:98:0x0137, B:99:0x013b, B:101:0x0141, B:105:0x0154, B:109:0x015f, B:112:0x03a1, B:118:0x03bd, B:121:0x006a, B:123:0x00fc, B:126:0x0102, B:128:0x010b, B:133:0x0076, B:134:0x00e8, B:137:0x007d, B:139:0x00ba, B:142:0x00c0, B:144:0x00d5, B:148:0x0086), top: B:2:0x000d }] */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        Logger logger2;
        ReadsService readsService;
        Object read;
        ReadMeta readMeta;
        ReadsService readsService2;
        Object prepareOptimizedRead;
        CreateBookmarkResult.Failed failed;
        Object v9;
        OptimizedReadPreparation optimizedReadPreparation;
        ReadsService readsService3;
        Object loadOptimizedReadIndex;
        ReadMeta readMeta2;
        CreateBookmarkResult.Failed failed2;
        List list;
        CreateBookmarkResult.Failed failed3;
        Chapter chapterFor;
        ChapterSlotIndex chapterSlotIndex;
        CreateBookmarkResult.Failed failed4;
        ReadsService readsService4;
        Object loadChapterContent;
        Object obj2;
        ChapterContent chapterContent;
        Object next;
        CreateBookmarkResult.Failed failed5;
        CreateBookmarkResult.Failed failed6;
        long j4;
        long j10;
        MediaAudioPosition mediaAudioPosition;
        ReadBookmarkService readBookmarkService;
        Integer num;
        xn.a aVar;
        Double d10;
        Double d11;
        String str;
        Object createBookmark;
        MediaAudioPositionResolver mediaAudioPositionResolver;
        CreateBookmarkResult.Failed failed7;
        CreateBookmarkResult.Failed failed8;
        CreateBookmarkResult.Failed failed9;
        Logger logger3;
        int i10 = this.label;
        xn.a aVar2 = xn.a.f37986a;
        try {
            switch (i10) {
                case 0:
                    sn.a.g(obj);
                    logger2 = this.this$0.logger;
                    logger2.log("CreateBookmarkFromOffsetUseCase", "Creating bookmark for readId=" + this.$readId + " at offset=" + this.$characterOffset);
                    readsService = this.this$0.readsService;
                    String str2 = this.$readId;
                    this.label = 1;
                    read = readsService.getRead(str2, this);
                    if (read == aVar2) {
                        return aVar2;
                    }
                    readMeta = (ReadMeta) read;
                    CreateBookmarkFromOffsetUseCase createBookmarkFromOffsetUseCase = this.this$0;
                    if (readMeta == null) {
                        readsService2 = createBookmarkFromOffsetUseCase.readsService;
                        String str3 = this.$readId;
                        this.L$0 = readMeta;
                        this.label = 2;
                        prepareOptimizedRead = readsService2.prepareOptimizedRead(str3, this);
                        if (prepareOptimizedRead == aVar2) {
                            return aVar2;
                        }
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                        this.L$0 = readMeta;
                        this.label = 3;
                        v9 = r.v((ir.i) prepareOptimizedRead, anonymousClass1, this);
                        if (v9 == aVar2) {
                            return aVar2;
                        }
                        optimizedReadPreparation = (OptimizedReadPreparation) v9;
                        CreateBookmarkFromOffsetUseCase createBookmarkFromOffsetUseCase2 = this.this$0;
                        if (optimizedReadPreparation == null) {
                            failed2 = createBookmarkFromOffsetUseCase2.failed(CreateBookmarkResult.FailureReason.OptimizedReadUnavailable, "Failed to prepare optimized read");
                            return failed2;
                        }
                        readsService3 = createBookmarkFromOffsetUseCase2.readsService;
                        String str4 = this.$readId;
                        this.L$0 = readMeta;
                        this.label = 4;
                        loadOptimizedReadIndex = readsService3.loadOptimizedReadIndex(str4, this);
                        if (loadOptimizedReadIndex != aVar2) {
                            readMeta2 = readMeta;
                            list = (List) loadOptimizedReadIndex;
                            if (list != null && !list.isEmpty()) {
                                chapterFor = ChapterContentKt.chapterFor(readMeta2.getChapters(), this.$characterOffset);
                                if (chapterFor == null) {
                                    Iterator it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj2 = it.next();
                                            if (((ChapterSlotIndex) obj2).getChapterIndex() == chapterFor.getIndex()) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    chapterSlotIndex = (ChapterSlotIndex) obj2;
                                } else {
                                    chapterSlotIndex = null;
                                }
                                if (chapterFor != null && chapterSlotIndex != null) {
                                    readsService4 = this.this$0.readsService;
                                    String str5 = this.$readId;
                                    int chapterIndex = chapterSlotIndex.getChapterIndex();
                                    this.L$0 = readMeta2;
                                    this.L$1 = null;
                                    this.L$2 = chapterFor;
                                    this.L$3 = chapterSlotIndex;
                                    this.label = 5;
                                    loadChapterContent = readsService4.loadChapterContent(str5, chapterIndex, this);
                                    if (loadChapterContent == aVar2) {
                                        return aVar2;
                                    }
                                    Chapter chapter = chapterFor;
                                    chapterContent = (ChapterContent) loadChapterContent;
                                    if (chapterContent == null) {
                                        failed9 = this.this$0.failed(CreateBookmarkResult.FailureReason.ChapterContentUnavailable, "Chapter content unavailable for chapter " + chapterSlotIndex.getChapterIndex());
                                        return failed9;
                                    }
                                    Integer num2 = chapterContent.getOffsetsToElementsMap().get(new Long(this.$characterOffset));
                                    if (num2 == null) {
                                        Set<Map.Entry<Long, Integer>> entrySet = chapterContent.getOffsetsToElementsMap().entrySet();
                                        long j11 = this.$characterOffset;
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj3 : entrySet) {
                                            if (((Number) ((Map.Entry) obj3).getKey()).longValue() <= j11) {
                                                arrayList.add(obj3);
                                            }
                                        }
                                        Iterator it2 = arrayList.iterator();
                                        if (!it2.hasNext()) {
                                            next = null;
                                        } else {
                                            next = it2.next();
                                            if (it2.hasNext()) {
                                                long longValue = ((Number) ((Map.Entry) next).getKey()).longValue();
                                                do {
                                                    Object next2 = it2.next();
                                                    long longValue2 = ((Number) ((Map.Entry) next2).getKey()).longValue();
                                                    if (longValue < longValue2) {
                                                        next = next2;
                                                        longValue = longValue2;
                                                    }
                                                } while (it2.hasNext());
                                            }
                                        }
                                        Map.Entry entry = (Map.Entry) next;
                                        if (entry != null) {
                                            num2 = (Integer) entry.getValue();
                                        } else {
                                            num2 = null;
                                        }
                                        if (num2 == null) {
                                            failed5 = this.this$0.failed(CreateBookmarkResult.FailureReason.OffsetLookupFailed, "Could not find element for offset " + this.$characterOffset);
                                            return failed5;
                                        }
                                    }
                                    int intValue = num2.intValue();
                                    if (chapterContent.getElements().isEmpty() || intValue < 0 || intValue >= chapterContent.getElements().size()) {
                                        failed6 = this.this$0.failed(CreateBookmarkResult.FailureReason.OffsetLookupFailed, "Element index " + intValue + " out of range for chapter " + chapterSlotIndex.getChapterIndex());
                                        return failed6;
                                    }
                                    BookmarkWindow bookmarkWindow$default = BookmarkWindowingKt.bookmarkWindow$default(chapterContent.getElements(), intValue, this.$characterOffset, 0, 8, null);
                                    if (bookmarkWindow$default == null) {
                                        failed8 = this.this$0.failed(CreateBookmarkResult.FailureReason.NoMatchingSpan, "No character offsets found around offset " + this.$characterOffset);
                                        return failed8;
                                    }
                                    if (n.m0(bookmarkWindow$default.getText())) {
                                        failed7 = this.this$0.failed(CreateBookmarkResult.FailureReason.HtmlUnparseable, "Extracted text is blank");
                                        return failed7;
                                    }
                                    long startOffset = bookmarkWindow$default.getStartOffset();
                                    long endOffset = bookmarkWindow$default.getEndOffset();
                                    String text = bookmarkWindow$default.getText();
                                    if (ReadMetaKt.isMediaType(readMeta2)) {
                                        mediaAudioPositionResolver = this.this$0.mediaAudioPositionResolver;
                                        mediaAudioPosition = mediaAudioPositionResolver.resolve(chapter, chapterContent.getPositionConverter(), startOffset, endOffset);
                                        j4 = startOffset;
                                        j10 = endOffset;
                                    } else {
                                        j4 = startOffset;
                                        j10 = endOffset;
                                        mediaAudioPosition = null;
                                    }
                                    readBookmarkService = this.this$0.bookmarkService;
                                    String str6 = this.$readId;
                                    if (mediaAudioPosition != null) {
                                        num = new Integer(mediaAudioPosition.getChapterIndex());
                                    } else {
                                        num = null;
                                    }
                                    if (mediaAudioPosition != null) {
                                        aVar = aVar2;
                                        d10 = new Double(mediaAudioPosition.getStartTimeSeconds());
                                    } else {
                                        aVar = aVar2;
                                        d10 = null;
                                    }
                                    if (mediaAudioPosition != null) {
                                        d11 = new Double(mediaAudioPosition.getEndTimeSeconds());
                                    } else {
                                        d11 = null;
                                    }
                                    str = text;
                                    CreateBookmarkRequest createBookmarkRequest = new CreateBookmarkRequest(j4, j10, str, null, num, d10, d11, 8, null);
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = str;
                                    this.L$7 = null;
                                    this.I$0 = intValue;
                                    this.J$0 = j4;
                                    this.J$1 = j10;
                                    this.label = 6;
                                    createBookmark = readBookmarkService.createBookmark(str6, createBookmarkRequest, this);
                                    aVar2 = aVar;
                                    break;
                                }
                                failed4 = this.this$0.failed(CreateBookmarkResult.FailureReason.OffsetLookupFailed, "No chapter contains offset " + this.$characterOffset);
                                return failed4;
                            }
                            failed3 = this.this$0.failed(CreateBookmarkResult.FailureReason.ChapterIndexEmpty, "Optimized read index is empty");
                            return failed3;
                        }
                        return aVar2;
                    }
                    failed = createBookmarkFromOffsetUseCase.failed(CreateBookmarkResult.FailureReason.ReadUnavailable, "Read metadata unavailable for " + this.$readId);
                    return failed;
                case 1:
                    sn.a.g(obj);
                    read = obj;
                    readMeta = (ReadMeta) read;
                    CreateBookmarkFromOffsetUseCase createBookmarkFromOffsetUseCase3 = this.this$0;
                    if (readMeta == null) {
                    }
                    break;
                case 2:
                    ReadMeta readMeta3 = (ReadMeta) this.L$0;
                    sn.a.g(obj);
                    readMeta = readMeta3;
                    prepareOptimizedRead = obj;
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(null);
                    this.L$0 = readMeta;
                    this.label = 3;
                    v9 = r.v((ir.i) prepareOptimizedRead, anonymousClass12, this);
                    if (v9 == aVar2) {
                    }
                    optimizedReadPreparation = (OptimizedReadPreparation) v9;
                    CreateBookmarkFromOffsetUseCase createBookmarkFromOffsetUseCase22 = this.this$0;
                    if (optimizedReadPreparation == null) {
                    }
                    break;
                case 3:
                    ReadMeta readMeta4 = (ReadMeta) this.L$0;
                    sn.a.g(obj);
                    readMeta = readMeta4;
                    v9 = obj;
                    optimizedReadPreparation = (OptimizedReadPreparation) v9;
                    CreateBookmarkFromOffsetUseCase createBookmarkFromOffsetUseCase222 = this.this$0;
                    if (optimizedReadPreparation == null) {
                    }
                    break;
                case 4:
                    ReadMeta readMeta5 = (ReadMeta) this.L$0;
                    sn.a.g(obj);
                    readMeta2 = readMeta5;
                    loadOptimizedReadIndex = obj;
                    list = (List) loadOptimizedReadIndex;
                    if (list != null) {
                        chapterFor = ChapterContentKt.chapterFor(readMeta2.getChapters(), this.$characterOffset);
                        if (chapterFor == null) {
                        }
                        if (chapterFor != null) {
                            readsService4 = this.this$0.readsService;
                            String str52 = this.$readId;
                            int chapterIndex2 = chapterSlotIndex.getChapterIndex();
                            this.L$0 = readMeta2;
                            this.L$1 = null;
                            this.L$2 = chapterFor;
                            this.L$3 = chapterSlotIndex;
                            this.label = 5;
                            loadChapterContent = readsService4.loadChapterContent(str52, chapterIndex2, this);
                            if (loadChapterContent == aVar2) {
                            }
                            Chapter chapter2 = chapterFor;
                            chapterContent = (ChapterContent) loadChapterContent;
                            if (chapterContent == null) {
                            }
                        }
                        failed4 = this.this$0.failed(CreateBookmarkResult.FailureReason.OffsetLookupFailed, "No chapter contains offset " + this.$characterOffset);
                        return failed4;
                    }
                    failed3 = this.this$0.failed(CreateBookmarkResult.FailureReason.ChapterIndexEmpty, "Optimized read index is empty");
                    return failed3;
                case 5:
                    chapterSlotIndex = (ChapterSlotIndex) this.L$3;
                    chapterFor = (Chapter) this.L$2;
                    readMeta2 = (ReadMeta) this.L$0;
                    sn.a.g(obj);
                    loadChapterContent = obj;
                    Chapter chapter22 = chapterFor;
                    chapterContent = (ChapterContent) loadChapterContent;
                    if (chapterContent == null) {
                    }
                    break;
                case 6:
                    String str7 = (String) this.L$6;
                    sn.a.g(obj);
                    str = str7;
                    createBookmark = obj;
                    String str8 = (String) createBookmark;
                    logger3 = this.this$0.logger;
                    logger3.log("CreateBookmarkFromOffsetUseCase", "Bookmark created successfully: " + str8 + " with text: " + n.J0(50, str) + "...");
                    return new CreateBookmarkResult.Success(str8);
                default:
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Exception e10) {
            logger = this.this$0.logger;
            logger.logError("CreateBookmarkFromOffsetUseCase", "Error creating bookmark from offset", e10);
            return new CreateBookmarkResult.Failed(CreateBookmarkResult.FailureReason.BookmarkPersistFailed);
        }
    }
}
