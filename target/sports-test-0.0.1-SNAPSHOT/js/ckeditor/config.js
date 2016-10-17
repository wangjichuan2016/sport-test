/**
 * @license Copyright (c) 2003-2015, CKSource - Frederico Knabben. All rights reserved.
 * For licensing, see LICENSE.md or http://ckeditor.com/license
 */

CKEDITOR.editorConfig = function( config ) {
	// Define changes to default configuration here. For example:
//	 config.language = 'fr';
//     config.skin = 'v2';
//     config.uiColor = '#FFF';
	// config.uiColor = '#AADC6E';
//    config.startupMode = 'source';
//    config.filebrowserImageBrowseUrl = 'kcfinder/browse.php?type=images';
    config.toolbar = 'Full';
    config.toolbar_Full =[
        ['Undo','Redo','-','Find','Replace','-','SelectAll','RemoveFormat'],
        ['Bold','Italic','Underline','Strike','-','Subscript','Superscript']
    ]
};
