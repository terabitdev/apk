package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import com.google.protobuf.c6;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.ReadBookmarkService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.readerapp.R;
import java.io.OutputStream;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ReadBookmarksViewModel$downloadBookmarks$1", f = "BookmarksSheet.kt", l = {114, 116, 156}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ReadBookmarksViewModel$downloadBookmarks$1 extends yn.i implements ho.p {
    Object L$0;
    int label;
    final /* synthetic */ ReadBookmarksViewModel this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ReadBookmarksViewModel$downloadBookmarks$1$2", f = "BookmarksSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ReadBookmarksViewModel$downloadBookmarks$1$2 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends yn.i implements ho.p {
        final /* synthetic */ AsyncCallResult<String> $result;
        int label;
        final /* synthetic */ ReadBookmarksViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ReadBookmarksViewModel readBookmarksViewModel, AsyncCallResult<String> asyncCallResult, wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.this$0 = readBookmarksViewModel;
            this.$result = asyncCallResult;
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass2(this.this$0, this.$result, cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            Logger logger;
            String str;
            ToastService toastService;
            StringProvider stringProvider;
            StringProvider stringProvider2;
            Context context;
            Analytics analytics;
            ToastService toastService2;
            StringProvider stringProvider3;
            if (this.label == 0) {
                sn.a.g(obj);
                try {
                    String readTitle = ((ReadBookmarksState) this.this$0.getStateFlow().getValue()).getReadTitle();
                    stringProvider2 = this.this$0.stringProvider;
                    String str2 = readTitle + " - " + stringProvider2.getString(R.string.bookmark_download_title) + ".md";
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", str2);
                    contentValues.put("mime_type", "text/markdown");
                    contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
                    context = this.this$0.context;
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri insert = contentResolver.insert(MediaStore.Files.getContentUri("external"), contentValues);
                    if (insert != null) {
                        AsyncCallResult<String> asyncCallResult = this.$result;
                        OutputStream openOutputStream = contentResolver.openOutputStream(insert);
                        if (openOutputStream != null) {
                            try {
                                byte[] bytes = ((String) ((AsyncCallResult.Success) asyncCallResult).getData()).getBytes(wq.b.f37231a);
                                bytes.getClass();
                                openOutputStream.write(bytes);
                                openOutputStream.close();
                            } finally {
                            }
                        }
                    }
                    analytics = this.this$0.analytics;
                    analytics.log(Analytics.Event.BookmarksExportedBookmarks.INSTANCE);
                    toastService2 = this.this$0.toastService;
                    stringProvider3 = this.this$0.stringProvider;
                    toastService2.showToast(stringProvider3.getString(R.string.bookmarks_download_success), new Integer(io.elevenlabs.ui.R.drawable.circle_check), ToastService.ToastVariant.SUCCESS);
                } catch (Exception e10) {
                    logger = this.this$0.logger;
                    str = this.this$0.tag;
                    logger.logWarning(str, "Failed to download bookmarks", e10);
                    toastService = this.this$0.toastService;
                    stringProvider = this.this$0.stringProvider;
                    ToastService.showToast$default(toastService, stringProvider.getString(R.string.bookmarks_download_failed), null, ToastService.ToastVariant.ERROR, 2, null);
                }
                return sn.z.f31622a;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ReadBookmarksViewModel$downloadBookmarks$1$3", f = "BookmarksSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ReadBookmarksViewModel$downloadBookmarks$1$3 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends yn.i implements ho.p {
        final /* synthetic */ AsyncCallResult<String> $result;
        int label;
        final /* synthetic */ ReadBookmarksViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ReadBookmarksViewModel readBookmarksViewModel, AsyncCallResult<String> asyncCallResult, wn.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.this$0 = readBookmarksViewModel;
            this.$result = asyncCallResult;
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass3(this.this$0, this.$result, cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass3) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            Logger logger;
            String str;
            ToastService toastService;
            StringProvider stringProvider;
            if (this.label == 0) {
                sn.a.g(obj);
                logger = this.this$0.logger;
                str = this.this$0.tag;
                Logger.logWarning$default(logger, str, "Failed to download bookmarks " + ((AsyncCallResult.Error) this.$result).getError(), null, 4, null);
                toastService = this.this$0.toastService;
                stringProvider = this.this$0.stringProvider;
                ToastService.showToast$default(toastService, stringProvider.getString(R.string.bookmarks_download_failed), null, ToastService.ToastVariant.ERROR, 2, null);
                return sn.z.f31622a;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadBookmarksViewModel$downloadBookmarks$1(ReadBookmarksViewModel readBookmarksViewModel, wn.c<? super ReadBookmarksViewModel$downloadBookmarks$1> cVar) {
        super(2, cVar);
        this.this$0 = readBookmarksViewModel;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ReadBookmarksViewModel$downloadBookmarks$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ReadBookmarksViewModel$downloadBookmarks$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if (fr.g0.Q(r0, r1, r6) == r4) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0093, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        if (fr.g0.Q(r0, r2, r6) == r4) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r7 == r4) goto L53;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReadBookmarkService readBookmarkService;
        DispatcherFactory dispatcherFactory;
        DispatcherFactory dispatcherFactory2;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
                this.this$0.queueStateUpdate(new o(2));
                return sn.z.f31622a;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            this.this$0.queueStateUpdate(new o(1));
            readBookmarkService = this.this$0.bookmarkService;
            String readId = ((ReadBookmarksState) this.this$0.getStateFlow().getValue()).getReadId();
            this.label = 1;
            obj = readBookmarkService.downloadBookmarksMarkdown(readId, this);
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Success) {
            dispatcherFactory2 = this.this$0.getDispatcherFactory();
            fr.z main = dispatcherFactory2.getMain();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, asyncCallResult, null);
            this.L$0 = null;
            this.label = 2;
        } else if (asyncCallResult instanceof AsyncCallResult.Error) {
            dispatcherFactory = this.this$0.getDispatcherFactory();
            fr.z main2 = dispatcherFactory.getMain();
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, asyncCallResult, null);
            this.L$0 = null;
            this.label = 3;
        } else {
            c6.p();
            return null;
        }
    }
}
