package io.elevenlabs.player;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.usecase.IsAudioBookmarksAllowedUseCase;
import io.elevenlabs.player.CreateBookmarkResult;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import sn.l;
import sn.z;
import w7.r0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$createBookmarkFromMediaButton$1", f = "BackgroundPlayerService.kt", l = {778, 779, 784, 795}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$createBookmarkFromMediaButton$1 extends i implements p {
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$createBookmarkFromMediaButton$1(BackgroundPlayerService backgroundPlayerService, wn.c<? super BackgroundPlayerService$createBookmarkFromMediaButton$1> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        BackgroundPlayerService$createBookmarkFromMediaButton$1 backgroundPlayerService$createBookmarkFromMediaButton$1 = new BackgroundPlayerService$createBookmarkFromMediaButton$1(this.this$0, cVar);
        backgroundPlayerService$createBookmarkFromMediaButton$1.L$0 = obj;
        return backgroundPlayerService$createBookmarkFromMediaButton$1;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((BackgroundPlayerService$createBookmarkFromMediaButton$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x015f, code lost:
    
        if (r14 == r8) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object lVar;
        ReadMeta readMeta;
        String str2;
        String str3;
        Long l4;
        Analytics.Event.BookmarksSavedBookmark.BookmarkType bookmarkType;
        Analytics.Event.BookmarksSavedBookmark.BookmarkType bookmarkType2;
        d0 d0Var = (d0) this.L$0;
        int i10 = this.label;
        z zVar = z.f31622a;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            bookmarkType2 = (Analytics.Event.BookmarksSavedBookmark.BookmarkType) this.L$4;
                            sn.a.g(obj);
                            CreateBookmarkResult createBookmarkResult = (CreateBookmarkResult) obj;
                            if (createBookmarkResult instanceof CreateBookmarkResult.Success) {
                                this.this$0.getAnalytics().log(new Analytics.Event.BookmarksSavedBookmark(Analytics.Event.BookmarksSavedBookmark.BookmarkSource.RemoteControl, bookmarkType2));
                                this.this$0.showBookmarkSuccessToast();
                            } else if (m.c(createBookmarkResult, CreateBookmarkResult.NotSupported.INSTANCE)) {
                                this.this$0.showBookmarkNotSupportedToast();
                            } else if (createBookmarkResult instanceof CreateBookmarkResult.Failed) {
                                this.this$0.showBookmarkErrorToast();
                            } else {
                                c6.p();
                                return null;
                            }
                            return zVar;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    readMeta = (ReadMeta) this.L$3;
                    str3 = (String) this.L$2;
                    sn.a.g(obj);
                    l4 = (Long) obj;
                    BackgroundPlayerService backgroundPlayerService = this.this$0;
                    if (l4 == null) {
                        long longValue = l4.longValue();
                        backgroundPlayerService.getLogger().log(this.this$0.tag, "Creating bookmark at position " + longValue + " for readId=" + str3);
                        if (readMeta == null || (bookmarkType = ReadMetaKt.bookmarkType(readMeta)) == null) {
                            bookmarkType = Analytics.Event.BookmarksSavedBookmark.BookmarkType.Tts;
                        }
                        bookmarkType2 = bookmarkType;
                        CreateBookmarkFromOffsetUseCase createBookmarkFromOffsetUseCase = this.this$0.getCreateBookmarkFromOffsetUseCase();
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = bookmarkType2;
                        this.J$0 = longValue;
                        this.label = 4;
                        obj = createBookmarkFromOffsetUseCase.invoke(str3, longValue, this);
                    } else {
                        Logger.logWarning$default(backgroundPlayerService.getLogger(), backgroundPlayerService.tag, defpackage.f.i("Cannot create bookmark: char offset unresolved for ", str3), null, 4, null);
                        backgroundPlayerService.showBookmarkErrorToast();
                        return zVar;
                    }
                } else {
                    readMeta = (ReadMeta) this.L$3;
                    str2 = (String) this.L$2;
                    sn.a.g(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        this.this$0.showBookmarkNotSupportedToast();
                        return zVar;
                    }
                    BackgroundPlayerService backgroundPlayerService2 = this.this$0;
                    this.L$0 = d0Var;
                    this.L$1 = null;
                    this.L$2 = str2;
                    this.L$3 = readMeta;
                    this.label = 3;
                    obj = backgroundPlayerService2.resolveBookmarkCharOffset(str2, readMeta, this);
                    if (obj != aVar) {
                        str3 = str2;
                        l4 = (Long) obj;
                        BackgroundPlayerService backgroundPlayerService3 = this.this$0;
                        if (l4 == null) {
                        }
                    }
                    return aVar;
                }
            } else {
                str = (String) this.L$2;
                try {
                    sn.a.g(obj);
                } catch (Throwable th) {
                    th = th;
                    lVar = new l(th);
                    if (lVar instanceof l) {
                    }
                    readMeta = (ReadMeta) lVar;
                    if (readMeta != null) {
                    }
                }
            }
        } else {
            sn.a.g(obj);
            r0 r0Var = (r0) this.this$0.currentMediaItem.getValue();
            if (r0Var == null) {
                Logger.logWarning$default(this.this$0.getLogger(), this.this$0.tag, "Cannot create bookmark: no current media item", null, 4, null);
                this.this$0.showBookmarkErrorToast();
                return zVar;
            }
            String str4 = r0Var.f36578a;
            str4.getClass();
            try {
                ReadsService readsService = this.this$0.getReadsService();
                this.L$0 = d0Var;
                this.L$1 = null;
                this.L$2 = str4;
                this.L$3 = null;
                this.I$0 = 0;
                this.label = 1;
                Object read = readsService.getRead(str4, this);
                if (read != aVar) {
                    str = str4;
                    obj = read;
                }
            } catch (Throwable th2) {
                th = th2;
                str = str4;
                lVar = new l(th);
                if (lVar instanceof l) {
                }
                readMeta = (ReadMeta) lVar;
                if (readMeta != null) {
                }
            }
            return aVar;
        }
        lVar = (ReadMeta) obj;
        if (lVar instanceof l) {
            lVar = null;
        }
        readMeta = (ReadMeta) lVar;
        if (readMeta != null) {
            IsAudioBookmarksAllowedUseCase isAudioBookmarksAllowedUseCase = this.this$0.isAudioBookmarksAllowedUseCase();
            this.L$0 = d0Var;
            this.L$1 = null;
            this.L$2 = str;
            this.L$3 = readMeta;
            this.label = 2;
            obj = isAudioBookmarksAllowedUseCase.invoke(readMeta, this);
            if (obj != aVar) {
                str2 = str;
                if (!((Boolean) obj).booleanValue()) {
                }
                BackgroundPlayerService backgroundPlayerService22 = this.this$0;
                this.L$0 = d0Var;
                this.L$1 = null;
                this.L$2 = str2;
                this.L$3 = readMeta;
                this.label = 3;
                obj = backgroundPlayerService22.resolveBookmarkCharOffset(str2, readMeta, this);
                if (obj != aVar) {
                }
            }
            return aVar;
        }
        str2 = str;
        BackgroundPlayerService backgroundPlayerService222 = this.this$0;
        this.L$0 = d0Var;
        this.L$1 = null;
        this.L$2 = str2;
        this.L$3 = readMeta;
        this.label = 3;
        obj = backgroundPlayerService222.resolveBookmarkCharOffset(str2, readMeta, this);
        if (obj != aVar) {
        }
        return aVar;
    }
}
